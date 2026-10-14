import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        int quantity = input.nextInt();
        final double TAX_RATE = 0.14;
        double subtotal = price * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        System.out.printf("Subtotal = %.2f%n", subtotal);
        System.out.printf("Tax = %.2f%n", tax);
        System.out.printf("Total = %.2f%n", total);
    }
}