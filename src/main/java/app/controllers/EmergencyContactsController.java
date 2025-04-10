package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EmergencyContactsController {

    @FXML private Label contactsStatusLabel;
    
    @FXML
    public void initialize(){
        // Stub: In a real app, load and display contacts and perhaps an interactive map.
        contactsStatusLabel.setText("Emergency contacts loaded. (Interactive maps not implemented in stub.)");
    }
}
