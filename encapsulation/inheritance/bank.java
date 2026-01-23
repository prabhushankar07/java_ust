package encapsulation.inheritance;

public class Bank {
    // Parent data
    double interestRate = 4.5;
}

class SavingAccount extends Bank {
    double balance = 10000;

    void calculateInterest() {
        // Using interestRate inherited from Bank
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest earned: $" + interest);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount myAcc = new SavingAccount();
        myAcc.calculateInterest();
    }
} {
    
}
