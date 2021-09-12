package fr.morpheus.weathorapplication.view.skyDesription;

import org.w3c.dom.ls.LSOutput;

public class WindDirection {
    private short windDegree;

    public WindDirection() {}

    public String conversion(double windDegree, double pressure) {
        String windDirection = "Error";
        SummerSeason summerSeason = new SummerSeason();   // entré windDirection en paramètre dans le constructeur
        if(pressure <= 1020) {
            if(isBetween(windDegree, 345, 50)) {    // Nord
                windDirection  = summerSeason.choiceSentences(1);
            }

            if(isBetween(windDegree, 51, 100)) {     // Est / Nord Est
                summerSeason.choiceSentences(2);
            }

            if(isBetween(windDegree, 101, 190)) {    // Sud / Sud Est
                summerSeason.choiceSentences(3);
            }

            if(isBetween(windDegree, 191, 250)) {
                summerSeason.choiceSentences(4);
            }

            if(isBetween(windDegree, 251, 345)) {
                summerSeason.choiceSentences(5);
            }
        }
        return windDirection;
    }

    private static boolean isBetween(double windDegree, int lower, int upper) {
        return windDegree >= lower && windDegree <= upper;


    }

}
