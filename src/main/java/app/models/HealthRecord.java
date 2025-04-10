package app.models;

public class HealthRecord {
    private int id;
    private String record;
    
    public HealthRecord(int id, String record) {
        this.id = id;
        this.record = record;
    }
    
    public int getId() { return id; }
    public String getRecord() { return record; }
}
