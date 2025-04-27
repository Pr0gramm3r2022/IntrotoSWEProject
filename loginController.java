etry.Pos;
import com.example.prototyping.TableStatus;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginScreen extends VBox {

    private JTextField usernameField;
    private JTextField passwordField;
    private Label messageLabel;

    // Constructor
    public LoginScreen(Stage stage) {
        // Declare UI components
        Label username = new Label();
        Label password = new Label();
        Button loginButton = new Button("Login");
        messageLabel = new Label();

        // Set up layout
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(username, password, loginButton, messageLabel);

        // Handle login button click
        loginButton.setOnAction(e -> handleLogin(stage));
    }

    // Handle login logic
    private void handleLogin(Stage stage)
    {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Here we are just using a simple check, you can replace this with actual validation
        if (username.equals("waiter") && password.equals("password123")) {
            messageLabel.setText("Login Successful!");
            messageLabel.setStyle("-fx-text-fill: green;");

            // After login, switch to the Table Status screen
            TableStatus tableStatus = new TableStatus(stage);
            Scene tableScene = new Scene(tableStatus, 600, 400);
            stage.setScene(tableScene);
        } else {
            messageLabel.setText("Invalid credentials. Try again.");
            messageLabel.setStyle("-fx-text-fill: red;");
        }
    }
}
