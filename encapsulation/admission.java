package encapsulation;

// Save this file exactly as: Admission.java
public class admission {
    // Private variable: marks
    private double marks;
    // Private variable for grade (hidden from user)
    private String grade;

    // Setter for marks
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            // Internal processing: Setter assigns grade internally
            if (marks >= 80) {
                this.grade = "Honors";
            } else if (marks >= 50) {
                this.grade = "Pass";
            } else {
                this.grade = "Fail";
            }
        } else {
            System.out.println("Invalid marks entered.");
        }
    }

    // Method to display results
    public void displayResult() {
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Main method to run the program
    public static void main(String[] args) {
        admission student = new admission();
        student.setMarks(85);
        student.displayResult();
    }
}