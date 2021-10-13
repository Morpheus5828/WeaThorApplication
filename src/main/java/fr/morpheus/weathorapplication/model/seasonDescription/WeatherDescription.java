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

    public WeatherDescription() {

    }


    public void chooseSeasonDescription() {
        Calendar date = Calendar.getInstance();
        int actualMonth = date.get(Calendar.MONTH);
        int actualDay = date.get(Calendar.DAY_OF_MONTH);

        System.out.println(actualDay);
        System.out.println(actualMonth);

        if(isInWinterPeriod(actualMonth, actualDay)) {
            System.out.println("winter is coming");
            // instance creation to have winter season description (coming soon)
        }
        if(isInSpringPeriod(actualMonth, actualDay)) {
            System.out.println("Spring fuck");
        }

        if(isInAutumnPeriod(actualMonth, actualDay)) {
            System.out.println("c'est l'automne");
        }
        else {
            System.out.println("marche pas trolleur");
        }

      //  if (localDate.getMonthValue() >= 10  || localDate.getDayOfMonth())
    }

    private boolean isInWinterPeriod(int actualMonth, int actualDay) {
        if(actualMonth >= firstWinterMonth && actualDay >= firstSeasonDay && actualMonth <= lastWinterMonth && actualDay <= lastSeasonDay)
            return true;
        return false;
    }

    private boolean isInSpringPeriod(int actualMonth, int actualDay) {
        if(actualMonth >= firstSpringMonth && actualDay >= firstSeasonDay && actualMonth <= lastSpringMonth && actualDay <= lastSeasonDay)
            return true;
        return false;
    }

    private boolean isInSummerPeriod(int actualMonth, int actualDay) {
        if(actualMonth >= firstSummerMonth && actualDay >= firstSeasonDay && actualMonth <= lastSummerMonth && actualDay <= lastSeasonDay)
            return true;
        return false;
    }

    private boolean isInAutumnPeriod(int actualMonth, int actualDay) {
        if(actualMonth >= firstAutumnMonth && actualDay >= firstSeasonDay && actualMonth <= lastAutumnMonth && actualDay <= lastSeasonDay)
            return true;
        return false;
    }
}
