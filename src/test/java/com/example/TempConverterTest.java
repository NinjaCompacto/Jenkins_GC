import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TempConverterTest {
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, TempConverter.fahrenheitToCelsius(32));
        assertEquals(100, TempConverter.fahrenheitToCelsius(212));
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, TempConverter.celsiusToFahrenheit(0));
        assertEquals(212, TempConverter.celsiusToFahrenheit(100));
    }
}
