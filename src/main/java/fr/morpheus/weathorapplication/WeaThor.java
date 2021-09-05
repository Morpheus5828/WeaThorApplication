package fr.morpheus.weathorapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class WeaThor extends Application {
    public static Boolean value = false;

    public boolean getValue() {
        System.out.println(value);
        return false;
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(WeaThor.class.getResource("layout.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.setTitle("WeaThor");
            stage.setScene(scene);
            stage.show();

            Group root = new Group();
            Scene scene2 = new Scene(root, 600, 600);
            Stage stage2 = new Stage();
            stage2.setScene(scene2);

            Text text = new Text("WHOOOOOA");
            root.getChildren().add(text);

            stage2.setScene(scene2);

            if(value) {
                stage2.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        launch();
    }
}