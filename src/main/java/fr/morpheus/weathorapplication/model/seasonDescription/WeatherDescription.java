package fr.morpheus.weathorapplication.model.seasonDescription;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class WeatherDescription {
    private static int firstSeasonDay = 21;
    private static int lastSeasonDay = 20;

    private static int firstWinterMonth = 10; // October
    private static int lastWinterMonth = 3; // March
    private static int firstSpringMonth = 3;
    private static int lastSpringMonth = 6;  //June
    private static int firstSummerMonth = 6;
    private static int lastSummerMonth = 9; //September
    private static int firstAutumnMonth = 9;
    private static int lastAutumnMonth = 12; //December

    private double pressureValue;
    private String windDirectionValue;

    public WeatherDescription(double pressure , String windDirection) {
        this.pressureValue = pressure;
        this.windDirectionValue = windDirection;
    }

    public WeatherDescription() {}

    public boolean getDescription(Calendar date) {
        date = Calendar.getInstance();
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

    public boolean isInAutumnPeriod(double actualMonth, double actualDay) {
        if((firstAutumnMonth >= actualMonth && firstSeasonDay >= actualDay) && (actualDay <= lastSeasonDay && actualMonth <= lastAutumnMonth)) {
            return true;
        }
        return false;
    }


}
