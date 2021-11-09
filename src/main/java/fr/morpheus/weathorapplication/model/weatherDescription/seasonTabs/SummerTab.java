package fr.morpheus.weathorapplication.model.weatherDescription.seasonTabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SummerTab {
    private static final byte numberOfRow = 4;
    private static final byte numberOfColumn = 4;

    public SummerTab() {}

    public void getSummerTextDescription() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "marseille");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from summerTab");

            while(resultSet.next()) {
                System.out.println(resultSet.getString("pressure"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
