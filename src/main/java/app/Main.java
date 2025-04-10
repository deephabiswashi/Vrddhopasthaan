package app;

import java.io.IOException;

import app.database.DatabaseManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Initialize the database (and create tables if needed)
        DatabaseManager.getInstance().initializeDatabase();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/home.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);
        primaryStage.setTitle("Vrddhopasthaan - Home");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
