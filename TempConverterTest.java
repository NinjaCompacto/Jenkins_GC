import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TempConverterTest {
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212));
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
    }
}
