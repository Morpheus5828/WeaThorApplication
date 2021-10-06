package fr.morpheus.weathorapplication.model.windAngleDirection;

public class WindDirection {
    private final double windValueDegree;
    private String windStringDegree = "";

    public WindDirection(double windDegreeValue) {
        this.windValueDegree = windDegreeValue;

        if(windDegreeValuesIsBetween(338, 23))
            this.windStringDegree  = "North";


        if(windDegreeValuesIsBetween(23, 68))
            this.windStringDegree  = "North / East";


        if(windDegreeValuesIsBetween(68, 113))
            this.windStringDegree  = "East";


        if(windDegreeValuesIsBetween(113, 158))
            this.windStringDegree  = "South / East";


        if(windDegreeValuesIsBetween(158, 203))
            this.windStringDegree  = "South";


        if(windDegreeValuesIsBetween(203, 248))
            this.windStringDegree = "South / West";


        if(windDegreeValuesIsBetween(248, 293))
            this.windStringDegree = "West";


        if(windDegreeValuesIsBetween(293, 338))
            this.windStringDegree = "North / West";

        if(windDegreeValuesIsBetween(338, 360))
            this.windStringDegree = "North";
    }



    private boolean windDegreeValuesIsBetween(double lower, double upper) {
        Boolean isBeetween = false;
        if(windValueDegree >= lower && windValueDegree < upper)
            isBeetween = true;
        return isBeetween;
    }

    public String getWindStringDegree() {
        return this.windStringDegree;
    }
}
