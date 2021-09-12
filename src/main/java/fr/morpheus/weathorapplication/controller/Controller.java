package fr.morpheus.weathorapplication.controller;

import fr.morpheus.weathorapplication.model.DataRequest;
import fr.morpheus.weathorapplication.view.skyDesription.WindDirection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML private Button search;
    @FXML private TextField cityName;
    @FXML private Label tempLabel;


    public void sendCityName(ActionEvent actionEvent) throws IOException {
        DataRequest model = new DataRequest(cityName.getText());
    }


    public void sendData (
            double  temp,
            double  tempMax,
            double  tempMin,
            double  pressure,
            double  humidity,
            double  speed,
            double degree
    )
    {
        WindDirection test = new WindDirection();
        System.out.println(test.conversion(degree, pressure));

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);
        Stage windows = new Stage();

        Text textResult = new Text(
                "Temperature : " + temp + "\n" +
                "Min : " + tempMin + "Max : " + tempMax + "\n" +
                "Pressure : " + pressure + "\n" +
                "Humidity : " + humidity + " %" + "\n" +
                "The wind speed is " + speed + "km/h"
        );
        textResult.setX(200);
        textResult.setY(200);

        root.getChildren().add(textResult);

        windows.setScene(scene);
        windows.show();


    }
}