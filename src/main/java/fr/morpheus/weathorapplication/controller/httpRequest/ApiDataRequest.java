package fr.morpheus.weathorapplication.controller.httpRequest;

import fr.morpheus.weathorapplication.model.DataExtraction;
import fr.morpheus.weathorapplication.view.errorDisplay.ErrorDisplay;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class ApiDataRequest {
    public ApiDataRequest() {}

    public ApiDataRequest(TextField cityName) {
        HttpClient client = HttpClient.newHttpClient();
        java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder().uri(URI.create(
            "https://api.openweathermap.org/data/2.5/weather?q="
            + cityName.getText()
            + "&appid=d120744058ced7a8d03d99218fc3e1e2"
        )).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 200) {
                DataExtraction convert = new DataExtraction(response.body());

            }
            else {
                ErrorDisplay.cityNotFound(cityName.getText());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

   public String convertSpaceToWebSpace(String cityName) {
       return cityName.replace( " ","%20" );

   }
}
