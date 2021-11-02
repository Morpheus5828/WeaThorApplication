package fr.morpheus.weathorapplication;

import fr.morpheus.weathorapplication.model.seasonDescription.WeatherDescription;
import fr.morpheus.weathorapplication.model.seasonDescription.seasonDecription.SummerText;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.Date;

public class WeaThor extends Application {
    @Override
    public void start(Stage stage)  {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(WeaThor.class.getResource("layout.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.setTitle("WeaThor");
            stage.setScene(scene);
            //stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}