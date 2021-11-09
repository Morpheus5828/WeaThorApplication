package fr.morpheus.weathorapplication.model.weatherDescription.seasonTabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SummerTab {

    public SummerTab() {}

    public void  getSummerTextDescription() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tableBase", "root", "marseille");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM summerTab");

            if(resultSet.next()) {
                String table = resultSet.getString("pressure");
                System.out.println(table);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
