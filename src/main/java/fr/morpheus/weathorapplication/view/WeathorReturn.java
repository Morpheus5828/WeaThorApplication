package fr.morpheus.weathorapplication.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WeathorReturn extends Application {

    private String textLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //FXMLLoader fxmlLoader = new FXMLLoader(WeathorReturn.class.getResource("weatherFile.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 400, 400);

        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        Label label = new Label(textLabel);
        root.getChildren().add(label);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void enterText(String text) {
        this.textLabel = text;
    }

    public static void main(String[] args) {
        launch();
    }

}
