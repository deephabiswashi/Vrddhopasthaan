package app.controllers;

import app.services.AppointmentService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppointmentController {

    @FXML
    private TextField patientNameField;
    @FXML
    private TextField doctorNameField;
    @FXML
    private TextField appointmentDateField; // Format: yyyy-MM-dd HH:mm
    @FXML
    private Label confirmationLabel;

    private AppointmentService appointmentService = new AppointmentService();

    @FXML
    private void bookAppointment() {
        String patientName = patientNameField.getText();
        String doctorName = doctorNameField.getText();
        String appointmentDate = appointmentDateField.getText();

        if (patientName.isEmpty() || doctorName.isEmpty() || appointmentDate.isEmpty()) {
            confirmationLabel.setText("Please fill in all details!");
            return;
        }

        boolean success = appointmentService.bookAppointment(patientName, doctorName, appointmentDate);
        if (success) {
            confirmationLabel.setText("Appointment booked for " + patientName + " with Dr. " + doctorName);
        } else {
            confirmationLabel.setText("Failed to book appointment. Please try again.");
        }
    }
}
