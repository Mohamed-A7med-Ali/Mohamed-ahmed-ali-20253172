
import java.util.Scanner;

class CashRegister {

    private int itemCount;
    private double totalPrice;

    // Default Constructor
    public CashRegister() {
        itemCount = 0;
        totalPrice = 0;
    }

    // Parameterized Constructor
    public CashRegister(int count, double price) {
        itemCount = count;
        totalPrice = price;
    }

    // Add Item Method
    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    // Clear Method
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }

    // Getters
    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CashRegister obj = new CashRegister();

        System.out.print("Enter price of first item: ");
        double p1 = input.nextDouble();

        System.out.print("Enter price of second item: ");
        double p2 = input.nextDouble();

        obj.addItem(p1);
        obj.addItem(p2);

        System.out.println("Item Count: " + obj.getItemCount());
        System.out.println("Total Price: " + obj.getTotalPrice());

        obj.clear();

        System.out.println("After Clear:");
        System.out.println("Item Count: " + obj.getItemCount());
        System.out.println("Total Price: " + obj.getTotalPrice());
    }
}
