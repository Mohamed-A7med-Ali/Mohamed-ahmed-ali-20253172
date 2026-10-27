import java.util.Scanner;

public class Main {

    public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double c = getDouble(s, "Enter temperature in Celsius: ");
        double f = celsiusToFahrenheit(c);

        System.out.printf("Fahrenheit: %.2f%n", f);
    }
}