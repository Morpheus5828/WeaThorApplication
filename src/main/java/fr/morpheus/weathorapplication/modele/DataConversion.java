package fr.morpheus.weathorapplication.modele;

import fr.morpheus.weathorapplication.controller.Controller;

import java.text.DecimalFormat;

public class DataConversion {
    private double temperature;
    private double temperature_Max;
    private double temperature_Min;
    private double pressure;
    private double humidity;
    private double speed;
    //private DecimalFormat f;

    public DataConversion(
            double temp,
            double  tempMax,
            double  tempMin,
            double  pressure,
            double  humidity,
            double  speed
    ) {
        //f.setMaximumFractionDigits(2);
        this.temperature = (double) temp - 273.15;
        this.temperature_Max = ((double) tempMax) - 273.15;
        this.temperature_Min = ((double) tempMin) - 273.15;
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;

        Controller test = new Controller();
        test.sendData(
                this.temperature,
                this.temperature_Max,
                this.temperature_Min,
                this.pressure,
                this.humidity,
                this.speed
        );
    }
}
