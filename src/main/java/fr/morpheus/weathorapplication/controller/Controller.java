package fr.morpheus.weathorapplication.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Button search;
    @FXML private TextField cityName;


    public void search(ActionEvent actionEvent) {
        System.out.println(cityName.getText());
    }
}