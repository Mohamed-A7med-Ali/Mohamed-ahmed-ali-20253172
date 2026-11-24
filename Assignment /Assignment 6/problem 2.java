class problem2 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("12345", 1000);

        b1.deposit(500);
        b1.withdraw(300);

        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Final Balance: " + b1.getBalance());
    }
}