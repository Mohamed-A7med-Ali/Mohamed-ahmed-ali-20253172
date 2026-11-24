
public class Motorcycle extends Vehicle {

    private int engineCapacity;

    public Motorcycle(String brand, String model, int year,
                      int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 300;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Engine Capacity: " + engineCapacity;
    }
}
