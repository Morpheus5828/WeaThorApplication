package fr.morpheus.weathorapplication.view.skyDesription;

public class WindDirection {
    public WindDirection() {}

    public String findWindDirection(double windDegree) {
        String windDirection = "Error";
            if(isBetween(windDegree, 0, 23))
                windDirection  = "North";


            if(isBetween(windDegree, 23, 68))
                windDirection  = "North / East";


            if(isBetween(windDegree, 68, 113))
                windDirection  = "East";


            if(isBetween(windDegree, 113, 158))
                windDirection  = "South / East";


            if(isBetween(windDegree, 158, 203))
                windDirection  = "South";


            if(isBetween(windDegree, 203, 248))
                windDirection = "South / West";


            if(isBetween(windDegree, 248, 293))
                windDirection = "West";


            if(isBetween(windDegree, 293, 338))
                windDirection = "North / West";

            if(isBetween(windDegree, 338, 360))
                windDirection = "North";

        return windDirection;
    }

    private static boolean isBetween(double windDegree, double lower, double upper) {
        Boolean autorisation = false;
        if(windDegree >= lower && windDegree < upper) {
            autorisation = true;
        }
        return autorisation;
    }
}
