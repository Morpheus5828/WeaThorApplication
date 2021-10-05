package testController;

import fr.morpheus.weathorapplication.controller.httpRequest.ApiDataRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestApiDataRequest {
    private ApiDataRequest  httpRequest;

    @BeforeEach
    public void initialize() {
        httpRequest = new ApiDataRequest();
    }

    @Test
    public void convertSpaceToWebSpaceTest() {
        assertThat(httpRequest.convertSpaceToWebSpace("La Ciotat")).isEqualTo("La%20Ciotat");
    }


}
