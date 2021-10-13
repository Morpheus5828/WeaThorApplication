package testModel;

import fr.morpheus.weathorapplication.model.seasonDescription.WeatherDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.*;

public class TestWeatherDescription {
    private WeatherDescription firstTest;
    private Calendar calendar;

    @BeforeEach
    public void initialize() {
        firstTest = new WeatherDescription();
        calendar = Calendar.getInstance();
    }

    @Test
    public void windDirectionTest() {
        assertThat(firstTest.getDescription(calendar)).isEqualTo(true);
        System.out.println(calendar);

    }
}
