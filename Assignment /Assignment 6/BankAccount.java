public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount() {
        accountNumber = "0000";
        balance = 0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
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