package fr.morpheus.weathorapplication;

import fr.morpheus.weathorapplication.model.weatherDescription.WeatherDescription;
import fr.morpheus.weathorapplication.model.weatherDescription.seasonTabs.SummerTab;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Calendar;

public class WeaThor extends Application {
    @Override
    public void start(Stage stage)  {
        try {
            WeatherDescription test = new WeatherDescription(10, "");
            Calendar calendar = Calendar.getInstance();
            SummerTab test1 = new SummerTab();
            test1.getSummerTextDescription();



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