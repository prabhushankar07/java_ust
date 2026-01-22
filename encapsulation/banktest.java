package encapsulation;

class BankAccount {
    // Private variables
    private String accountNumber;
    private double balance;

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with Validation Logic
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }
}

public class banktest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        
        // Testing valid balance
        account.setBalance(500.0);
        System.out.println("Current Balance: $" + account.getBalance());

        // Testing invalid (negative) balance
        account.setBalance(-100.0); 
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
