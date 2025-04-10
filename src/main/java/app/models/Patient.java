package app.models;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(int id, String name, int age, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Getters and setters…
}
