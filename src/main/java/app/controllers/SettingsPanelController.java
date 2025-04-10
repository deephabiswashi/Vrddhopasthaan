package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class SettingsPanelController {

    @FXML private ChoiceBox<String> themeChoiceBox;
    @FXML private Label settingsStatusLabel;
    
    @FXML
    public void initialize(){
        themeChoiceBox.getItems().addAll("Light", "Dark", "Vibrant");
        themeChoiceBox.setValue("Vibrant");
    }
    
    @FXML
    private void applySettings(){
        String theme = themeChoiceBox.getValue();
        // Apply theme settings (in a real app you might change the CSS dynamically)
        settingsStatusLabel.setText("Theme set to " + theme);
    }
}
