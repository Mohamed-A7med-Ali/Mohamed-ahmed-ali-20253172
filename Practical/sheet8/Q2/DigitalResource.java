
public class DigitalResource extends LibraryItem {

    private String fileFormat;
    private double fileSize;

    public DigitalResource(int itemId, String title, int publicationYear,
                           String fileFormat, double fileSize) {

        super(itemId, title, publicationYear);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    @Override
    public double calculateLateFee(int days) {
        return days * 3;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Format: " + fileFormat);
        System.out.println("File Size: " + fileSize);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", File Format: " + fileFormat +
               ", File Size: " + fileSize;
    }
}
