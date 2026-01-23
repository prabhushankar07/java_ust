package encapsulation.inheritance;

public class Person {
    String name;

    // Person constructor initializes name
    Person(String name) {
        this.name = name;
        System.out.println("Parent constructor called.");
    }
}

class Student extends Person {
    int rollNo;

    // Student constructor initializes rollNo
    Student(String name, int rollNo) {
        // Use super() to call parent constructor
        super(name);
        this.rollNo = rollNo;
        System.out.println("Child constructor called.");
    }

    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        // We pass data for both the parent and child through the child constructor
        Student s = new Student("Alex", 55);
        s.display();
    }
} {
    
}
