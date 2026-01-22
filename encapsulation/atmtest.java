package encapsulation;

class ATMAccount {
    // Private variables: pin, balance
    private int pin;
    private double balance;

    // setPin() validates exactly 4 digits
    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
            System.out.println("PIN updated successfully.");
        } else {
            System.out.println("Error: PIN must be exactly 4 digits.");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // withdraw(amount) checks balance before deduction
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } else {
            System.out.println("Error: Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class atmtest {
    public static void main(String[] args) {
        ATMAccount account = new ATMAccount();
        
        // Testing PIN validation
        account.setPin(123);    // Invalid
        account.setPin(1234);   // Valid
        
        account.setBalance(1000.0);
        
        // Testing secure withdrawal
        account.withdraw(1200.0); // Insufficient funds
        account.withdraw(500.0);  // Successful
    }
}
