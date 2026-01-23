package encapsulation.inheritance;

public class Employee {
    double salary = 50000;
}

class Manager extends Employee {
    double bonus = 15000;

    void calculateTotalSalary() {
        // Reusing the salary property from Employee
        double total = salary + bonus;
        System.out.println("Total Manager Salary: $" + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateTotalSalary();
    }
} {
    
}
