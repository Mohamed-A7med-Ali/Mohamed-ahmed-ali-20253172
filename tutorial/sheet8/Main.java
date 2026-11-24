
public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee("Ahmed", 101, 10000);

        Manager mgr = new Manager("Mohamed", 102, 20000,
                                  "IT", 3000);

        Employee ref = mgr;

        System.out.println("Employee Bonus: " +
                           emp.calculateBonus());

        System.out.println("Employee Bonus (15%): " +
                           emp.calculateBonus(15));

        System.out.println("Manager Bonus: " +
                           mgr.calculateBonus());

        System.out.println("Manager Bonus using Parent Reference: " +
                           ref.calculateBonus());

        System.out.println("\nEmployee Information:");
        emp.displayInfo();

        System.out.println("\nManager Information:");
        mgr.displayInfo();

        System.out.println("\nUsing toString():");
        System.out.println(emp);
        System.out.println(mgr);

        System.out.println("\nParent Reference:");
        ref.displayInfo();
        System.out.println(ref);
    }
}
