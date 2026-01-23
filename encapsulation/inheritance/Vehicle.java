package encapsulation.inheritance;

public class Vehicle {
    int speed = 120;
}

class Car extends Vehicle {
    String brand = "Tesla";

    void showSpeed() {
        // Directly using 'speed' inherited from Vehicle
        System.out.println(brand + " is running at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showSpeed();
    }
} {
    
}
