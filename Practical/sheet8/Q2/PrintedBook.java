
public class PrintedBook extends LibraryItem {

    private String author;
    private int numberOfPages;

    public PrintedBook(int itemId, String title, int publicationYear,
                       String author, int numberOfPages) {

        super(itemId, title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 7;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Author: " + author +
               ", Number of Pages: " + numberOfPages;
    }
}
