import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class loginController {
  // create labels, text fields, and buttons 
    @FXML
    private Label username;
    @FXML
    private Label password;
    @FXML
    private TextField userField;
    @FXML
    private PasswordField passField;
    @FXML
    private Button loginButton;
    @FXML
  // actions when login button is clicked, if information is correct  moves to the next screen else an error message is displayed 
    private void handleLoginButton()
    {
        String user = userField.getText();
        String pass = passField.getText();
        if(user.equals("Kimberly J") && pass.equals("kim123")) || user.equals("John S") && pass.equals("john123")|| user.equals("Bob M") && pass.equals("bob123")
        {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("FloorScreen.fxml"));
            Parent tableStatusRoot = loader.load();

            Stage stage = (Stage) usernameField.getScene().getWindow();

            //  sets the new screen
            Scene FloorScene = new Scene(FloorStatusRoot);
            stage.setScene(FloorScene);

        } catch (Exception e) {
        e.printStackTrace();
    }
    } else {
        // Show error message if wrong login
        System.out.println("Invalid login, please try again.");
    }
        }
        }
}
