package fr.morpheus.weathorapplication.modele;

public class DataConversion {
    private double temp;
    private double tempMax;
    private double tempMin;
    private double pressure;
    private double humidity;
    private double speed;

    public DataConversion(
            double temp,
            double  tempMax,
            double  tempMin,
            double  pressure,
            double  humidity,
            double  speed
    ) {

        this.temp = ((double) temp) - 273.15;
        this.tempMax = ((double) tempMax) - 273.15;
        this.tempMin = ((double) tempMin) - 273.15;
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "DataConversion{" +
                "temp=" + temp +
                ", tempMax=" + tempMax +
                ", tempMin=" + tempMin +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", speed=" + speed +
                '}';
    }
}
