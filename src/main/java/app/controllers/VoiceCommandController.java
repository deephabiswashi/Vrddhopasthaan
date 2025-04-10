package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VoiceCommandController {

    @FXML private Label voiceStatusLabel;
    
    @FXML
    private void startVoiceRecognition(){
        // Stub: In reality, you would integrate with a voice API.
        voiceStatusLabel.setText("Voice recognition activated. Say 'help' to trigger an alert.");
    }
}
