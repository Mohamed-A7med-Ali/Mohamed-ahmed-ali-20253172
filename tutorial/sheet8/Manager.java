
public class Manager extends Employee {

    private String department;
    private double allowance;

    public Manager(String name, int id, double salary,
                   String department, double allowance) {

        super(name, id, salary);
        this.department = department;
        this.allowance = allowance;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Allowance: " + allowance);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Department: " + department +
               ", Allowance: " + allowance;
    }
}
