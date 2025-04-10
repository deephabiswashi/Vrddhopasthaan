package app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static DatabaseManager instance;
    private static final String DB_URL = "jdbc:sqlite:vrddhopasthaan.db";

    private DatabaseManager() { }

    public static DatabaseManager getInstance(){
        if(instance == null){
            instance = new DatabaseManager();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    /**
     * Create appointments table if it does not already exist.
     */
    public void initializeDatabase(){
        String sql = "CREATE TABLE IF NOT EXISTS appointments ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + " patientName TEXT NOT NULL, "
                + " doctorName TEXT NOT NULL, "
                + " appointmentDate TEXT NOT NULL "
                + ");";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
