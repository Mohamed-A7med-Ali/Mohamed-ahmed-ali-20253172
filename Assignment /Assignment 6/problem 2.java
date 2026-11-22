
class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount() {
        accountNumber = "0000";
        balance = 0;
    }

    public BankAccount(String number, double b) {
        accountNumber = number;
        balance = b;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class problem2 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("12345", 1000);

        b1.deposit(500);

        b1.withdraw(300);

        System.out.println("Account Number: " + b1.getAccountNumber());

        System.out.println("Final Balance: " + b1.getBalance());
    }
}
