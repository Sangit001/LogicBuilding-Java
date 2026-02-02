class BankAccount {

    // Encapsulation: data hiding
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display details
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {

        // Creating object
        BankAccount acc1 = new BankAccount("Sangeet", 5000);

        acc1.displayAccount();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayAccount();
    }
}
