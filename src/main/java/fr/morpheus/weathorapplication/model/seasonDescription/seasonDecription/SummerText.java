package fr.morpheus.weathorapplication.model.seasonDescription.seasonDecription;

public class SummerText {
    private SummerText() {}


    public static String getSummerTextDescription() {
        String[][] summerTextDescription = new String[4][4];
        summerTextDescription[0][0] = "Weather is good or really good,\n hot days and chilly night";
        summerTextDescription[0][1] = "Weather is good,\n hot days and chilly night";
        summerTextDescription[0][2] = "";

    return summerTextDescription[0][1];
    }
}
