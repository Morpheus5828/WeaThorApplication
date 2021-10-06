package testController;

import fr.morpheus.weathorapplication.controller.httpRequest.ApiDataRequest;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApiDataRequest {
    private ApiDataRequest httpRequestFirstCity;

    @Test
    public void constructorTest () {
        TextField textLCT = new TextField();
        textLCT.setText("Cassis");
        httpRequestFirstCity = new ApiDataRequest(textLCT);
        int statusCode = httpRequestFirstCity.getStatusCode();
        assertEquals(statusCode, 404);



    }

}
