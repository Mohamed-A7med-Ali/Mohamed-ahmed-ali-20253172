
public class Main {

    public static void main(String[] args) {

        PrintedBook book = new PrintedBook(
                101, "Java Programming", 2024,
                "Ahmed Ali", 350);

        DigitalResource resource = new DigitalResource(
                102, "Java Tutorial", 2025,
                "PDF", 15.5);

        System.out.println("Printed Book Information:");
        book.displayInfo();

        System.out.println("\nDigital Resource Information:");
        resource.displayInfo();

        System.out.println("\nLate Fees for 5 Days:");
        System.out.println("Printed Book: " +
                book.calculateLateFee(5));

        System.out.println("Digital Resource: " +
                resource.calculateLateFee(5));

        System.out.println("\nLate Fee with Discount:");
        System.out.println("Printed Book: " +
                book.calculateLateFee(5, 10));

        System.out.println("Digital Resource: " +
                resource.calculateLateFee(5, 10));

        System.out.println("\nUsing toString():");
        System.out.println(book);
        System.out.println(resource);

        LibraryItem ref = book;

        System.out.println("\nParent Reference:");
        System.out.println("Late Fee: " +
                ref.calculateLateFee(5));
    }
}
