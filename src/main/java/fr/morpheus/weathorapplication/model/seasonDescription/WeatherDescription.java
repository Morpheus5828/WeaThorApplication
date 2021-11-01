package fr.morpheus.weathorapplication.model.seasonDescription;

import java.util.Calendar;
import java.util.Date;

public class WeatherDescription {

    private double pressureValue;
    private String windDirectionValue;

    public WeatherDescription(double pressure , String windDirection) {
        this.pressureValue = pressure;
        this.windDirectionValue = windDirection;
    }

    public WeatherDescription() {}

    public boolean getDescription(Calendar date) {
        int actualMonth = date.get(Calendar.MONTH);
        int actualDay = date.get(Calendar.DAY_OF_MONTH);

        System.out.println(actualDay);
        System.out.println(actualMonth);

        if(isInAutumnPeriod(actualMonth, actualDay)) {
            System.out.println("winter is coming");
            return true;
            // instance creation to have winter season description (coming soon)

        }
        return false;
    }

    public boolean isInAutumnPeriod(double currentMonth, double currentDay) {
        if(currentMonth == Calendar.SEPTEMBER && 21 <= currentDay)
            return true;
        if(currentMonth == Calendar.OCTOBER)
            return true;
        if(currentMonth == Calendar.NOVEMBER)
            return true;
        if(currentMonth == Calendar.DECEMBER && currentDay <= 20)
            return true;
        return false;
    }

    public boolean isInWinterPeriod(double currentMonth, double currentDay) {
        if(currentMonth == Calendar.DECEMBER && 21 <= currentDay)
            return true;
        if(currentMonth == Calendar.JANUARY)
            return true;
        if(currentMonth == Calendar.FEBRUARY)
            return true;
        if(currentMonth == Calendar.MARCH && currentDay <= 20)
        return true;
    return false;
    }

    public boolean isInSpringPeriod(double currentMonth, double currentDay) {
        if(currentMonth == Calendar.MARCH && 21 <= currentDay)
            return true;
        if(currentMonth == Calendar.APRIL)
            return true;
        if(currentMonth == Calendar.MAY)
            return true;
        if(currentMonth == Calendar.JUNE && currentDay <= 20)
            return true;
        return false;
    }

    public boolean isInSummerPeriod(double currentMonth, double currentDay) {
        if(currentMonth == Calendar.JUNE && 21 <= currentDay)
            return true;
        if(currentMonth == Calendar.JULY)
            return true;
        if(currentMonth == Calendar.AUGUST)
            return true;
        if(currentMonth == Calendar.SEPTEMBER && currentDay <= 20)
            return true;
        return false;
    }



}
