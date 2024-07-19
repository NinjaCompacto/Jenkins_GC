public class TempConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        //return (fahrenheit - 32) * 5 / 9;
        return (fahrenheit - 32) * 2 / 9; // inserindo erro, para reproduzir cenário 3. Build instavel.
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
