package loose.oose.fis.lab.student.manager.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    public Text loginMessage;
    @FXML
    public PasswordField passwordField;
    @FXML
    public TextField usernameField;

    @FXML
    public void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.isEmpty()) {
            loginMessage.setText("Please type in a username!");
            return;
        }

        if (password == null || password.isEmpty()) {
            loginMessage.setText("Password cannot be empty");
            return;
        }

        if (username.equals("student") && password.equals("student")) {
            loginMessage.setText("Logged in as student!");
            return;
        }

        if (username.equals("teacher") && password.equals("teacher")) {
            loginMessage.setText("Logged in as teacher!");
            return;
        }

        loginMessage.setText("Incorrect login!");
    }
}

.root-pane {
        -fx-background-color: rosybrown;
        }

        .label {
        -fx-font-size: 16px;
        -fx-font-weight: bolder;
        -fx-text-fill: green;
        }

        #title-text {
        -fx-font-size: 40px;
        -fx-font-family: "Arial Rounded MT Bold";
        -fx-fill: yellow;
        }

        #actionTarget {
        -fx-fill: red;
        -fx-font-weight: bold;
        }

        .button {
        -fx-text-fill: white;
        -fx-font-family: "Arial Narrow";
        -fx-font-weight: bold;
        }

