package app.models;

public class Appointment {
    private int id;
    private String patientName;
    private String doctorName;
    private String appointmentDate; // In a simple format (e.g., "yyyy-MM-dd HH:mm")

    public Appointment(int id, String patientName, String doctorName, String appointmentDate) {
        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    // Getters and setters as needed
    public int getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }
}
