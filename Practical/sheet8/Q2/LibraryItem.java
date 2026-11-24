
public class LibraryItem {

    private int itemId;
    private String title;
    private int publicationYear;

    public LibraryItem(int itemId, String title, int publicationYear) {
        this.itemId = itemId;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double calculateLateFee(int days) {
        return days * 5;
    }

    public double calculateLateFee(int days, double discount) {
        double fee = calculateLateFee(days);
        return fee - (fee * discount / 100);
    }

    public void displayInfo() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId +
               ", Title: " + title +
               ", Publication Year: " + publicationYear;
    }
}
