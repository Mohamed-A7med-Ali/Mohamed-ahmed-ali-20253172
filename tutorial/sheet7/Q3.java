
import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private double price;

    // Unparameterized Constructor
    public Book() {
        title = "";
        author = "";
        price = 0;
    }

    // Parameterized Constructor
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Apply Discount
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    // Check if Expensive
    public boolean isExpensive() {
        return price > 500;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = input.nextInt();

        Book books[] = new Book[n];

        // Read books information
        for (int i = 0; i < n; i++) {

            input.nextLine();

            System.out.print("Enter book title: ");
            String title = input.nextLine();

            System.out.print("Enter author: ");
            String author = input.nextLine();

            System.out.print("Enter price: ");
            double price = input.nextDouble();

            books[i] = new Book(title, author, price);
        }

        // Apply discount
        System.out.print("Enter book index: ");
        int index = input.nextInt();

        System.out.print("Enter discount percentage: ");
        double percentage = input.nextDouble();

        books[index].applyDiscount(percentage);

        // Display all books
        for (int i = 0; i < n; i++) {

            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Price: " + books[i].getPrice());

            if (books[i].isExpensive()) {
                System.out.println("Expensive");
            } else {
                System.out.println("Not Expensive");
            }
        }
    }
}
