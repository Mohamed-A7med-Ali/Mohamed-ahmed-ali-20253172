
import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Unparameterized Constructor
    public BankAccount() {
        accountNumber = 0;
        accountHolder = "";
        balance = 0;
    }

    // Parameterized Constructor
    public BankAccount(int n, String h, double b) {
        accountNumber = n;
        accountHolder = h;
        balance = b;
    }

    // Deposit
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Accessor Methods (Getters)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int n = input.nextInt();

        input.nextLine();

        System.out.print("Enter account holder: ");
        String h = input.nextLine();

        System.out.print("Enter balance: ");
        double b = input.nextDouble();

        BankAccount obj = new BankAccount(n, h, b);

        System.out.print("Enter deposit amount: ");
        double d = input.nextDouble();
        obj.deposit(d);

        System.out.print("Enter withdraw amount: ");
        double w = input.nextDouble();
        obj.withdraw(w);

        System.out.println("Account Number: " + obj.getAccountNumber());
        System.out.println("Account Holder: " + obj.getAccountHolder());
        System.out.println("Balance: " + obj.getBalance());
    }
}
