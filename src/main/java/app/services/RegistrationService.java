package app.services;

public class RegistrationService {
    public boolean registerUser(String username, String password){
        // Stub: store the user in a database
        return username != null && !username.isEmpty();
    }
    
    public boolean loginUser(String username, String password){
        // Stub: verify login credentials.
        return "user".equals(username) && "pass".equals(password);
    }
}
