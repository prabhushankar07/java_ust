package encapsulation.inheritance;

public class Person {
    String name = "John Doe";
    int age = 20;
}

class Student extends Person {
    int rollNo = 101;

    void display() {
        // Accessing both parent and child variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
} {
    
}
