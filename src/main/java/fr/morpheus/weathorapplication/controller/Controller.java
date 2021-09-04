package fr.morpheus.weathorapplication.controller;

import fr.morpheus.weathorapplication.modele.DataRequest;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Button search;
    @FXML private TextField cityName;

    public void sendCityName(ActionEvent actionEvent) {
        DataRequest modele = new DataRequest(cityName.getText());
    }

}