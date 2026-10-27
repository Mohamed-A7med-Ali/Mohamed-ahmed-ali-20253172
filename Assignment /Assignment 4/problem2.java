import java.util.Scanner;

public class Main {

    public static double coneVolume(double dValue, double hValue) {
        double r = dValue / 2;
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * hValue;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double d = s.nextDouble();

        System.out.print("Enter height: ");
        double h = s.nextDouble();

        double volume = coneVolume(d, h);

        System.out.printf("Volume: %.2f%n", volume);
    }
}