package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CaregiverModeController {

    @FXML private Label caregiverInfoLabel;
    
    @FXML
    public void initialize(){
        caregiverInfoLabel.setText("Caregiver view: Current user reminders displayed here.");
    }
}
