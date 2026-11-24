
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 700;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Number of Doors: " + numberOfDoors;
    }
}
