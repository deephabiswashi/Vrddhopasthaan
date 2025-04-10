package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HealthRecordsController {

    @FXML private TextArea healthRecordsArea;
    
    @FXML
    public void initialize(){
        // Load and display health records – stubbed text.
        healthRecordsArea.setText("Health Record 1: Blood Pressure 120/80\nHealth Record 2: Weight: 70kg");
    }
}
