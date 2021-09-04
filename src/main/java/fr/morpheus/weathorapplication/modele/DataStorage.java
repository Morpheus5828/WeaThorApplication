package fr.morpheus.weathorapplication.modele;

public class DataStorage {
    private double actualTemperature;
    private double maxTemperature;
    private double minTemperature;
    private double pressure;
    private double humidity;
    private double speed;

    public DataStorage(Object temp, Object tempMax, Object tempMin, Object pressure, Object humidity, Object speed) {
        this.actualTemperature = (double) temp;
        this.maxTemperature = (double) tempMax;
        this.minTemperature = (double) tempMin;
        this.pressure = (double) pressure;
        this.humidity = (double) speed;
    }
}
