package fr.morpheus.weathorapplication.view.windSeasonDisplay;

public class SummerDescription {
    private String skyDescription = "";
    public SummerDescription() {}

    public String getMinimalPressureDescription(byte value) {

        switch (value) {
            case 1:
                skyDescription = "Rainfall and wind" + "\n" +
                                  "Temperatures will be soft";
                break;
            case 2:
                skyDescription = "Rainfall and storm, it's winding" + "\n" +
                                 "Weather will be hot and damp";
                break;
            case 3:
                skyDescription = "Heavy rainfall, big storm, and strong wind"  + "\n" +
                                 " Temperatures will be hot ";
                break;
            case 4:
                skyDescription = "Heavy rainfall and big storm" + "\n" +
                                 "Hot temperatures";
                break;
            case 5:
                skyDescription = "A bit rainfall and storm trend" + "\n" +
                                 "Soft and damp";
                break;

        }
        return skyDescription;
    }

    /*public String getFirstPressureDescrption(byte value) {
        switch(value) {
            case 1:
            case 2:
                skyDescription = "Thunderstorm" + "\n" +
                                 "Soft temperature";
                break;
            case 3:
                skyDescription = "Heavy rainfall" + "\n" +
                                 "Dry temperature";
                break;
            case 4:
                skyDescription = "";
                break;
        }
    }*/
}
