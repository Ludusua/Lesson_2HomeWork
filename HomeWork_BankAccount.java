package HomeWork2_Java_Pro;

public class HomeWork_BankAccount {
    private String owner;
    private double balance;

    public HomeWork_BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;

        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Balance is not enough or invalid amount ");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void main(String[] args) {

        // Example 1 - Kolya - Galya 1280

        HomeWork_BankAccount account1 = new HomeWork_BankAccount("Kolya", 1280);
        System.out.println("Initial Balance: " + account1.balance);

        account1.deposit(500);
        System.out.println("Balance after deposit: " + account1.getBalance());

        account1.withdraw(480);
        System.out.println("Balance after withdraw1: " + account1.getBalance());

        account1.withdraw(100);
        System.out.println("Balance after withdraw2: " + account1.getBalance());

        System.out.println("Account owner: " + account1.getOwner());

        account1.setOwner("Galya");
        System.out.println("New account owner: " + account1.getOwner());

        System.out.println( );

        // Example 2 - Vasya - Kostya - 500

        HomeWork_BankAccount account2 = new HomeWork_BankAccount("Vasya", 500);
        System.out.println("Initial Balance: " + account2.balance);

        account2.deposit(333);
        System.out.println("Balance after deposit: " + account2.getBalance());
        ;

        account2.withdraw(33);
        System.out.println("Balance after withdraw1: " + account2.getBalance());

        System.out.println("Account owner: " + account2.getOwner());

        account2.setOwner("Kostya");
        System.out.println("New account owner: " + account2.getOwner());

    }


}
