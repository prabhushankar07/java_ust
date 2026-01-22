package encapsulation;
class Student {
    // Private variables (Data Hiding)
    private int id;
    private String name;

    // Public Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Public Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Method to display details using getters
    public void displayStudentInfo() {
        System.out.println("Student ID: " + getId());
        System.out.println("Student Name: " + getName());
    }
}

public class studentencapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Alice");
        
        s1.displayStudentInfo();
    }
}
