package fr.morpheus.weathorapplication.view.skyDesription;

public class SummerSeason {
    public SummerSeason() {}

    public String choiceSentences(int value) {
        String skyDescription = "Nothing";

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

        }
        return skyDescription;
    }
}
