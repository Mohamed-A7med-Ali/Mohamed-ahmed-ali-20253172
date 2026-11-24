
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2024, 4);

        Motorcycle motorcycle =
                new Motorcycle("Honda", "CBR", 2023, 600);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();

        System.out.println("\nRental Prices for 3 Days:");
        System.out.println("Car: " +
                car.calculateRentalPrice(3));

        System.out.println("Motorcycle: " +
                motorcycle.calculateRentalPrice(3));

        System.out.println("\nRental Price with Discount:");
        System.out.println("Car: " +
                car.calculateRentalPrice(3, 10));

        System.out.println("Motorcycle: " +
                motorcycle.calculateRentalPrice(3, 10));

        System.out.println("\nUsing toString():");
        System.out.println(car);
        System.out.println(motorcycle);
    }
}
