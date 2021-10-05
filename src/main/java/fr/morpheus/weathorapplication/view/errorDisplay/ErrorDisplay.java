package fr.morpheus.weathorapplication.view.errorDisplay;

import javafx.scene.control.Alert;

public class ErrorDisplay {
    public static void cityNotFound(String cityName) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Warning Alert");
        alert.setHeaderText(null);
        alert.setContentText("City : "+ cityName +" not found" + "\n" + " Please try again");
        alert.showAndWait();
    }
}
