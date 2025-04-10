package app.controllers;

import app.models.Appointment;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView; // Reusing Appointment as a placeholder for medication history

public class MedicationHistoryController {

    @FXML private TableView<Appointment> historyTable;
    @FXML private TableColumn<Appointment, String> patientColumn;
    @FXML private TableColumn<Appointment, String> doctorColumn;
    @FXML private TableColumn<Appointment, String> dateColumn;
    
    @FXML
    public void initialize(){
        // In a real app, populate the table with data from the database.
        // For now, this is a stub.
    }
}
