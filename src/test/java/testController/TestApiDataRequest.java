package testController;

import fr.morpheus.weathorapplication.controller.httpRequest.ApiDataRequest;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestApiDataRequest {
    private ApiDataRequest  httpRequest;

    @BeforeEach
    public void initialize() {
        httpRequest = new ApiDataRequest(new TextField("La Ciotat"));
    }

    @Test
    public void convertSpaceToWebSpaceTest() {
        assertThat(httpRequest.convertSpaceToWebSpace()).isEqualTo("La%20Ciotat");
    }


}
