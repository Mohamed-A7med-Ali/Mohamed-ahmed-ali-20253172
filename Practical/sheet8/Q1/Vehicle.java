
public class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double calculateRentalPrice(int days) {
        return days * 500;
    }

    public double calculateRentalPrice(int days, double discount) {
        return calculateRentalPrice(days) -
               (calculateRentalPrice(days) * discount / 100);
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
               ", Model: " + model +
               ", Year: " + year;
    }
}
