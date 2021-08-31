module fr.morpheus.weathorapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.morpheus.weathorapplication to javafx.fxml;
    exports fr.morpheus.weathorapplication;
}