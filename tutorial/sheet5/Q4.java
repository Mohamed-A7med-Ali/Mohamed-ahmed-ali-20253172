import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sales = new int[7];
        int total = 0;
        int count = 0;

        System.out.println("Enter sales of 7 days:");

        for (int i = 0; i < 7; i++) {
            sales[i] = input.nextInt();
            total += sales[i];

            if (sales[i] > 20) {
                count++;
            }
        }

        long average = Math.round(total / 7.0);

        System.out.println("Total: " + total);
        System.out.println("Days greater than 20: " + count);
        System.out.println("Average: " + average);
    }
}