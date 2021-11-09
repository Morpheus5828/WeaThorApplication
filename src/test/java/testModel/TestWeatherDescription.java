package testModel;

import fr.morpheus.weathorapplication.model.weatherDescription.WeatherDescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.*;

public class TestWeatherDescription {
    private WeatherDescription currentPeriod;

    @BeforeEach
    public void initialize() {
        currentPeriod = new WeatherDescription();
    }


    @Test
    public void isInAutumnPeriodTest() {
        for(int day = 1; day <= 31; day++) {
            if(day < 21)
               assertThat(this.currentPeriod.isInAutumnPeriod(Calendar.SEPTEMBER, day)).isEqualTo(false);
            else {
                assertThat(this.currentPeriod.isInAutumnPeriod(Calendar.SEPTEMBER, day)).isEqualTo(true);
            }
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInAutumnPeriod(Calendar.OCTOBER, day)).isEqualTo(true);
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInAutumnPeriod(Calendar.NOVEMBER, day)).isEqualTo(true);

        }

        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInAutumnPeriod(Calendar.DECEMBER, day)).isEqualTo(true);
            else {
                assertThat(this.currentPeriod.isInAutumnPeriod(Calendar.DECEMBER, day)).isEqualTo(false);
            }
        }
    }
    @Test
    public void isInWinterPeriodTest() {
        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInWinterPeriod(Calendar.DECEMBER, day)).isEqualTo(false);
            else {
                assertThat(this.currentPeriod.isInWinterPeriod(Calendar.DECEMBER, day)).isEqualTo(true);
            }
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInWinterPeriod(Calendar.JANUARY, day)).isEqualTo(true);
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInWinterPeriod(Calendar.FEBRUARY, day)).isEqualTo(true);

        }

        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInWinterPeriod(Calendar.MARCH, day)).isEqualTo(true);
            else {
                assertThat(this.currentPeriod.isInWinterPeriod(Calendar.MARCH, day)).isEqualTo(false);
            }
        }
    }
    @Test
    public void isInSpringPeriodTest() {
        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInSpringPeriod(Calendar.MARCH, day)).isEqualTo(false);
            else {
                assertThat(this.currentPeriod.isInSpringPeriod(Calendar.MARCH, day)).isEqualTo(true);
            }
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInSpringPeriod(Calendar.APRIL, day)).isEqualTo(true);
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInSpringPeriod(Calendar.MAY, day)).isEqualTo(true);

        }

        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInSpringPeriod(Calendar.JUNE, day)).isEqualTo(true);
            else {
                assertThat(this.currentPeriod.isInSpringPeriod(Calendar.JUNE, day)).isEqualTo(false);
            }
        }
    }

    @Test
    public void isInSummerPeriodTest() {
        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInSummerPeriod(Calendar.JUNE, day)).isEqualTo(false);
            else {
                assertThat(this.currentPeriod.isInSummerPeriod(Calendar.JUNE, day)).isEqualTo(true);
            }
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInSummerPeriod(Calendar.JULY, day)).isEqualTo(true);
        }

        for(int day = 1; day <= 31; day++) {
            assertThat(this.currentPeriod.isInSummerPeriod(Calendar.AUGUST, day)).isEqualTo(true);

        }

        for(int day = 1; day <= 31; day++) {
            if(day < 21)
                assertThat(this.currentPeriod.isInSummerPeriod(Calendar.SEPTEMBER, day)).isEqualTo(true);
            else {
                assertThat(this.currentPeriod.isInSummerPeriod(Calendar.SEPTEMBER, day)).isEqualTo(false);
            }
        }
    }
}
