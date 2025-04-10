package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EmergencySOSController {

    @FXML private Label sosStatusLabel;
    
    @FXML
    private void triggerSOS(){
        // In a real app, you’d integrate with external APIs and send alerts.
        sosStatusLabel.setText("Emergency SOS triggered! Help is on the way.");
    }
}
