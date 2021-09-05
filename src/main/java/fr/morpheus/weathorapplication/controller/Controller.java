package fr.morpheus.weathorapplication.controller;

import fr.morpheus.weathorapplication.WeaThor;
import fr.morpheus.weathorapplication.modele.DataRequest;
import fr.morpheus.weathorapplication.view.WeathorReturn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    @FXML private Button search;
    @FXML private Button result;
    @FXML private TextField cityName;
    @FXML private Label tempLabel;
    private Stage stage;
    private Scene scene;


    public void sendCityName(ActionEvent actionEvent) {
        DataRequest modele = new DataRequest(cityName.getText());
    }

    public void setTempLabel(Label label) {
        this.tempLabel = label;
    }

    public void switchScene2() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Controller.class.getResource("weatherFile.fxml")));
        FXMLLoader fxmlLoader = new FXMLLoader(WeaThor.class.getResource("weatherFile.fxml"));
        stage = new Stage();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToScene() throws IOException {
        WeaThor.value = true;
        WeaThor test = new WeaThor();
        System.out.println(test.getValue());
        test.start(new Stage());
    }

    /*
    public void launchOrder(Stage stage) {
        Group root = new Group();
        Scene secondScene = new Scene(root, 100, 100);
        Label label = new Label("Temperature ==> "  + testTemperature);
        stage.
    }
    */

    public void sendData (
            double temp,
            double  tempMax,
            double  tempMin,
            double  pressure,
            double  humidity,
            double  speed)  {
       if(temp > 5) {




       }
    }
}