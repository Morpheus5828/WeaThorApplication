package fr.morpheus.weathorapplication.model;

import fr.morpheus.weathorapplication.controller.Controller;

import java.math.BigDecimal;

public class DataConversion {
    private double temperature;
    private double temperature_Max;
    private double temperature_Min;
    private double pressure;
    private double humidity;
    private double speed;
    private double degree;
    private double scale = Math.pow(10, 3);

    public DataConversion(
            double temp,
            double  tempMax,
            double  tempMin,
            double  pressure,
            double  humidity,
            double  speed,
            double degree
    ) {
        this.temperature = Math.round((scale *((double) temp - 273.15))/scale);
        this.temperature_Max = Math.round((scale *((double) tempMax - 273.15))/scale);
        this.temperature_Min = Math.round((scale *((double) tempMin - 273.15))/scale);
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;
        this.degree = degree;

        Controller test = new Controller();
        test.sendData(
                this.temperature,
                this.temperature_Max,
                this.temperature_Min,
                this.pressure,
                this.humidity,
                this.speed,
                this.degree
        );
    }
}
