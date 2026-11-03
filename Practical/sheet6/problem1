
class Invoice {

    private int invoiceID;
    private double discount;
    private double totalInvoice;

    // Default Constructor
    public Invoice() {
        invoiceID = 1;
        discount = 2.5;
        totalInvoice = 100;
    }

    // Parameterized Constructor
    public Invoice(int id, double d, double total) {
        invoiceID = id;
        discount = d;
        totalInvoice = total;
    }

    // Getter Methods
    public int getInvoiceID() {
        return invoiceID;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    // Setter Methods
    public void setInvoiceID(int id) {
        invoiceID = id;
    }

    public void setDiscount(double d) {
        discount = d;
    }

    public void setTotalInvoice(double total) {
        totalInvoice = total;
    }

    // Calculate Discount Price
    public double calculateDiscountPrice() {
        return totalInvoice - (totalInvoice * discount / 100);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Invoice obj = new Invoice();

        System.out.println(obj.getInvoiceID() + " "
                + obj.getDiscount()
                + " Before discount: "
                + obj.getTotalInvoice()
                + " After discount:"
                + obj.calculateDiscountPrice());

        obj.setDiscount(5.5);
        obj.setTotalInvoice(200);

        System.out.println(obj.getInvoiceID() + " "
                + obj.getDiscount()
                + " Before discount: "
                + obj.getTotalInvoice()
                + " After discount:"
                + obj.calculateDiscountPrice());
    }
}
