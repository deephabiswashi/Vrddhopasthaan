package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import app.services.AlertService;

public class MedicationAlertController {

    @FXML private TextField medicationField;
    @FXML private TextField alertTimeField; // e.g., "08:00"
    @FXML private Label alertStatusLabel;
    
    private AlertService alertService = new AlertService();
    
    @FXML
    private void setCustomAlert(){
        String medication = medicationField.getText();
        String time = alertTimeField.getText();
        boolean result = alertService.setAlert(medication, time);
        alertStatusLabel.setText(result ? "Alert set for " + medication + " at " + time : "Failed to set alert.");
    }
}
