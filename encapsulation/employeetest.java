package encapsulation;

class Employee {
    // Private variables (Controlled access)
    private int empId;
    private double salary;

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Setter for salary with restriction (salary > 0)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary: Must be greater than 0.");
        }
    }

    // Method to display salary
    public void displaySalary() {
        System.out.println("Employee ID: " + empId + " | Salary: $" + salary);
    }
}

public class employeetest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(501);
        
        // Valid salary
        emp.setSalary(4500.50);
        emp.displaySalary();

        // Invalid salary attempt
        emp.setSalary(-100); 
    }
}