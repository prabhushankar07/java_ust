package encapsulation.inheritance;

public class Animal1 {
    void eat() {
        System.out.println("This animal is eating...");
    }
}

class Dog extends Animal1 {
    void bark() {
        System.out.println("The dog is barking!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Child method
    }
} {
    
}
