package fr.morpheus.weathorapplication.modele;

import com.google.gson.Gson;

import java.util.Map;

public class DataExtraction {
    private Object temp;
    private Object tempMax;
    private Object tempMin;
    private Object pressure;
    private Object humidity;
    private Object speed;
    private Gson gson;

    public DataExtraction(String responseBody) {

        gson = new Gson();
        Map jsonFile = gson.fromJson(responseBody, Map.class);
        Object main = jsonFile.get("main");
        Object wind = jsonFile.get("wind");

        String mainResult = String.valueOf(main);
        Map mainMap = gson.fromJson(mainResult, Map.class);
        String windResult = String.valueOf(wind);
        Map windMap = gson.fromJson(windResult, Map.class);

        this.temp = mainMap.get("temp");
        this.tempMax = mainMap.get("temp_max");
        this.tempMin = mainMap.get("temp_min");
        this.pressure  = mainMap.get("pressure");
        this.humidity = mainMap.get("humidity");
        this.speed = windMap.get("speed");

        DataConversion conversion = new DataConversion(
                (double) this.temp,
                (double) this.tempMax,
                (double) this.tempMin,
                (double) this.pressure,
                (double) this.humidity,
                (double) this.speed);

    }
}


