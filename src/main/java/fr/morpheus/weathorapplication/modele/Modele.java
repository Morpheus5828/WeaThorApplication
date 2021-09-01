package fr.morpheus.weathorapplication.modele;

import fr.morpheus.weathorapplication.controller.Controller;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import com.google.gson.Gson;
//import org.json.simple.JSONValue;
//import org.json.simple.JsonObject;


public class Modele {
    private String city = Controller.city;

    public Modele() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(
                URI.create("https://api.openweathermap.org/data/2.5/weather?q=Marseille&appid=d120744058ced7a8d03d99218fc3e1e2")
                ).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 200) {
                String resultJson = response.body();
                Gson test = new Gson();

                //Map<String, String> result = new

            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
