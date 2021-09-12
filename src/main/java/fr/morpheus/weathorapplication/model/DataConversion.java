package fr.morpheus.weathorapplication.model;

import fr.morpheus.weathorapplication.controller.Controller;

public class DataConversion {
    private double temperature;
    private double temperature_Max;
    private double temperature_Min;
    private double pressure;
    private double humidity;
    private double speed;
    private double degree;
    //private DecimalFormat f;

    public DataConversion(
            double temp,
            double  tempMax,
            double  tempMin,
            double  pressure,
            double  humidity,
            double  speed,
            double degree
    ) {
        //f.setMaximumFractionDigits(2);
        this.temperature = (double) temp - 273.15;
        this.temperature_Max = ((double) tempMax) - 273.15;
        this.temperature_Min = ((double) tempMin) - 273.15;
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
