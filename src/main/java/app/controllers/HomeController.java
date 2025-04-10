package app.controllers;

import java.io.IOException;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomeController {

    @FXML
    private ImageView logoImage; // animated logo

    @FXML
    public void initialize(){
        RotateTransition rt = new RotateTransition(Duration.seconds(3), logoImage);
        rt.setByAngle(360);
        rt.setCycleCount(RotateTransition.INDEFINITE);
        rt.play();
    }

    @FXML
    private void openRegistrationWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/registration.fxml"));
        Scene scene = new Scene(loader.load(), 500, 400);
        Stage stage = new Stage();
        stage.setTitle("User Registration/Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void openAppointmentWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/appointment.fxml"));
        Scene scene = new Scene(loader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Appointment Scheduling");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openEmergencySOSWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/emergencySOS.fxml"));
        Scene scene = new Scene(loader.load(), 400, 300);
        Stage stage = new Stage();
        stage.setTitle("Emergency SOS");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openHealthRecordsWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/healthRecords.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        Stage stage = new Stage();
        stage.setTitle("Health Records Tracking");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openMedicationAlertWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/medicationAlert.fxml"));
        Scene scene = new Scene(loader.load(), 500, 400);
        Stage stage = new Stage();
        stage.setTitle("Custom Medication Alerts");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openVoiceCommandWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/voiceCommand.fxml"));
        Scene scene = new Scene(loader.load(), 500, 400);
        Stage stage = new Stage();
        stage.setTitle("Voice Command Support");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openCaregiverModeWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/caregiverMode.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        Stage stage = new Stage();
        stage.setTitle("Caregiver Mode");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openMedicationHistoryWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/medicationHistory.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        Stage stage = new Stage();
        stage.setTitle("Medication History & Health Records");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openEmergencyContactsWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/emergencyContacts.fxml"));
        Scene scene = new Scene(loader.load(), 600, 500);
        Stage stage = new Stage();
        stage.setTitle("Emergency Contacts Management");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void openSettingsWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/settings.fxml"));
        Scene scene = new Scene(loader.load(), 500, 400);
        Stage stage = new Stage();
        stage.setTitle("Settings Panel");
        stage.setScene(scene);
        stage.show();
    }
}
