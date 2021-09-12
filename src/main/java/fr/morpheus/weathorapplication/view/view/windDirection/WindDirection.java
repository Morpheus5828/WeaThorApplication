package fr.morpheus.weathorapplication.view.view.windDirection;

import javafx.scene.text.Text;

public class WindDirection {
    private short windDegree;

    public WindDirection() {}

    public String conversion(double windDegree, double pressure) {
        String windDirection = "";
        if(isBetween(windDegree, 200, 300) && pressure > 1010) {
            windDirection = "Beau, il fera chaud dans la journée et assez frais la nuit";
        }
        return windDirection;
    }

    private static boolean isBetween(double windDegree, int lower, int upper) {
        return windDegree >= lower && windDegree <= upper;


    }

}
