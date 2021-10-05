module fr.morpheus.weathorapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;

    opens fr.morpheus.weathorapplication to javafx.fxml;
    exports fr.morpheus.weathorapplication;
    exports fr.morpheus.weathorapplication.controller;
    opens fr.morpheus.weathorapplication.controller to javafx.fxml;
    exports fr.morpheus.weathorapplication.controller.httpRequest;
    opens fr.morpheus.weathorapplication.controller.httpRequest to javafx.fxml;

}