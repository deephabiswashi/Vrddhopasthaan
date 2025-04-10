package app.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import app.database.DatabaseManager;

public class AppointmentService {

    /**
     * Books an appointment by saving its details to a SQLite database.
     */
    public boolean bookAppointment(String patientName, String doctorName, String appointmentDate) {
        String sql = "INSERT INTO appointments(patientName, doctorName, appointmentDate) VALUES (?,?,?)";
        try (Connection conn = DatabaseManager.getInstance().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, patientName);
            pstmt.setString(2, doctorName);
            pstmt.setString(3, appointmentDate);
            pstmt.executeUpdate();
            // For dynamic update demonstration: you might refresh a list view here.
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
