package com.example.prototyping;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login Screen.fxml")));

        // Set up
        stage.setTitle("Login");
        stage.setScene(new Scene((Parent) root));
        stage.show();
        Scene scene = new Scene((Parent) root, 800, 600);  // Set window size
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
