public class Temperature {
    
    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit");
        System.out.println("-------------------");
        for (double celsius = 40.0; celsius >= 31.0; celsius--) {
            System.out.printf("Celsius  %.1f  Fahrenheit  %.1f\n", celsius, celsiusToFahrenheit(celsius));
        }

        System.out.println("\nFahrenheit  Celsius");
        System.out.println("-------------------");
        for (double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit -= 10) {
            System.out.printf("Fahrenheit  %.1f  Celsius  %.2f\n", fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }
}
