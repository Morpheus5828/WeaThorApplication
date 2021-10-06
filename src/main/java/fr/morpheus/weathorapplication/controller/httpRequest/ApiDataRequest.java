package fr.morpheus.weathorapplication.controller.httpRequest;

import fr.morpheus.weathorapplication.model.DataExtraction;
import fr.morpheus.weathorapplication.view.errorDisplay.ErrorDisplay;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiDataRequest {
    private final String cityName;
    private static final int REQUEST_SUCCESSFUL = 200;
    private int statusCode;

    public ApiDataRequest(TextField cityName) {
        this.cityName = cityName.getText();
        String cityNameWithoutSpace = this.convertSpaceToWebSpace();

        HttpClient client = HttpClient.newHttpClient();

        java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder().uri(URI.create(
            "https://api.openweathermap.org/data/2.5/weather?q="
            + cityNameWithoutSpace
            + "&appid=d120744058ced7a8d03d99218fc3e1e2"
        )).build();

        testingForDataExtraction(cityName, client, request);
    }

    private void testingForDataExtraction(TextField cityName, HttpClient client, HttpRequest request) {
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            statusCode = response.statusCode();

            if(response.statusCode() == REQUEST_SUCCESSFUL) {
               new DataExtraction(response.body());

            }
            else {
                ErrorDisplay.cityNotFound(cityName.getText());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String convertSpaceToWebSpace() {
       return this.cityName.replace( " ","%20" );
   }

    public int getStatusCode() {
        return this.statusCode;
    }
}
