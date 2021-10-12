package fr.morpheus.weathorapplication.model.seasonDescription;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class WeatherDescription {
    public WeatherDescription() {
        Date actualDate = new Date();
        LocalDate localDate = actualDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate.getMonth());

    }

    public void chooseSeasonDescription(Date data) {
        
    }

}
