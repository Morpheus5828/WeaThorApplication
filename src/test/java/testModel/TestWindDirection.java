package testModel;
import fr.morpheus.weathorapplication.model.windDirectionModification.WindDirection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestWindDirection {
    private WindDirection wind;

    @BeforeEach
    public void initialize() {
        wind = new WindDirection(10);
    }


    @Test
    public void windDirectionTest() {
        assertThat(wind.getWindStringDegree()).isEqualTo("North");


    }
}
