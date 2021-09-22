package fr.morpheus.weathorapplication.view.skyDesription;

public class WindDirection {
    private short windDegree;
    private final int MIN_STEP_PRESSURE_VALUE = 1006;
    private final int MIDDLE_STEP_PRESSURE_VALUE = 1013;
    private final int MAX_STEP_PRESSURE_VALUE = 1020;
    private final byte FIRST_DESCRIPTION = 1;
    private final byte SECOND_DESCRIPTION = 2;
    private final byte THIRD_DESCRIPTION = 3;
    private final byte FOURTH_DESCRIPTION = 4;
    private final byte FIFTH_DESCRIPTION = 5;

    public WindDirection() {}

    public String conversion(double windDegree, double pressure) {
        String windDirection = "Error";
        SummerDescription summerDescription = new SummerDescription();
        if(pressure <= MIN_STEP_PRESSURE_VALUE) {
            if(isBetween(windDegree, 345, 50)) {    // Nord
                windDirection  = summerDescription.getMinimalPressureDescription(FIFTH_DESCRIPTION);
            }

            if(isBetween(windDegree, 51, 100)) {     // Est / Nord Est
                windDirection  = summerDescription.getMinimalPressureDescription(SECOND_DESCRIPTION);
            }

            if(isBetween(windDegree, 101, 190)) {    // Sud / Sud Est
                windDirection  = summerDescription.getMinimalPressureDescription(THIRD_DESCRIPTION);
            }

            if(isBetween(windDegree, 191, 250)) {
                windDirection  = summerDescription.getMinimalPressureDescription(FOURTH_DESCRIPTION);
            }

            if(isBetween(windDegree, 251, 345)) {
                windDirection  = summerDescription.getMinimalPressureDescription(FIFTH_DESCRIPTION);
            }
        }
        
        if(MIN_STEP_PRESSURE_VALUE < pressure && pressure <= MIDDLE_STEP_PRESSURE_VALUE) {
            
        }

        return windDirection;
    }

    private static boolean isBetween(double windDegree, int lower, int upper) {
        Boolean autorisation = false;
        if(windDegree >= lower && windDegree <= upper) {
            autorisation = true;
        }
        return autorisation;


    }

}
