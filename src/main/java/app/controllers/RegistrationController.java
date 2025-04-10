package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import app.services.RegistrationService;

public class RegistrationController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;
    
    private RegistrationService registrationService = new RegistrationService();

    @FXML
    private void handleRegister(){
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Basic stub – you’d add proper validation and encryption here.
        boolean success = registrationService.registerUser(username, password);
        statusLabel.setText(success ? "Registration Successful!" : "Registration Failed.");
    }
    
    @FXML
    private void handleLogin(){
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean success = registrationService.loginUser(username, password);
        statusLabel.setText(success ? "Login Successful!" : "Login Failed.");
    }
}
