package fr.morpheus.weathorapplication.model.weatherDescription.seasonTabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SummerTabRequest {

    public SummerTabRequest() {}

    public void  getSummerTextDescription() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tableBase", "root", "marseille");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from summerTab where pressure = 1006 and windDirection = 'North'");

            if(resultSet.next()) {
                String table = resultSet.getString("description");
                System.out.println(table);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
