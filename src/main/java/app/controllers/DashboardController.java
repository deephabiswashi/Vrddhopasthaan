package app.controllers;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class DashboardController {

    @FXML
    private ImageView dashboardLogo;

    @FXML
    public void initialize(){
        // Animate the dashboard logo with a slow continuous rotation
        RotateTransition rotate = new RotateTransition(Duration.seconds(5), dashboardLogo);
        rotate.setByAngle(360);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();
    }
}
