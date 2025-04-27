package com.example.jsrestaurantautomation;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.*;
import java.util.*;

public class LoginController {
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Button loginBtn;

    private static List<Waiter> waiters = new ArrayList<>();

    @FXML
    public void initialize() {
        loadWaiters();
        loginBtn.setOnAction(e -> login());
    }

    private void login() {
        String user = username.getText();
        String pass = password.getText();

        for (Waiter w : waiters) {
            if (w.getName().equals(user) && w.getPassword().equals(pass)) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FloorView.fxml"));
                    Scene scene = new Scene(loader.load());

                    FloorController controller = loader.getController();
                    controller.setWaiter(w);

                    Stage stage = (Stage) loginBtn.getScene().getWindow();
                    stage.setScene(scene);
                    stage.setTitle("Floor View - " + w.getName());
                    stage.show();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                return;
            }
        }

        Alert alert = new Alert(Alert.AlertType.ERROR, "Login failed");
        alert.show();
    }

    private void loadWaiters() {
        try (BufferedReader reader = new BufferedReader(new FileReader("waiters.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;

                String name = parts[0];
                String pass = parts[1];
                List<Integer> tables = new ArrayList<>();
                for (String s : parts[2].split("\\|")) {
                    tables.add(Integer.parseInt(s));
                }
                waiters.add(new Waiter(name, pass, tables));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}