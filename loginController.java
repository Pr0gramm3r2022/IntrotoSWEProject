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

 
    public LoginScreen(Stage stage) {
       
        Label username = new Label();
        Label password = new Label();
        Button loginButton = new Button("Login");
        messageLabel = new Label();

          this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(username, password, loginButton, messageLabel);

        // login button click
        loginButton.setOnAction(e -> handleLogin(stage));
    }

    //  login 
    private void handleLogin(Stage stage)
    {
        String username = usernameField.getText();
        String password = passwordField.getText();

    
        if (username.equals(staff.txt) && password.equals(staff.txt)) {
            messageLabel.setText("Login Successful!");
            messageLabel.setStyle("-fx-text-fill: green;");

            // switch to the Table Status screen
            TableStatus tableStatus = new TableStatus(stage);
            Scene tableScene = new Scene(tableStatus, 600, 400);
            stage.setScene(tableScene);
        } else {
            messageLabel.setText("Invalid. Try again.");
            messageLabel.setStyle("-fx-text-fill: red;");
        }
    }
}
