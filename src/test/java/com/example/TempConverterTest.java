import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TempConverterTest {
    @Test
    public void testFahrenheitToCelsius() {
        // inserindo erro para apontar erro de build Cenário 2.
        assertEquals(0, TempConverterERRO_PROPOSITAL.fahrenheitToCelsius(32));
        assertEquals(100, TempConverter.fahrenheitToCelsius(212));
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, TempConverter.celsiusToFahrenheit(0));
        assertEquals(212, TempConverter.celsiusToFahrenheit(100));
    }
}
