package encapsulation;

class Product {
    // Private variable
    private double price;

    // Setter with business rule validation (100 - 100000)
    public void setPrice(double price) {
        if (price >= 100 && price <= 100000) {
            this.price = price;
            System.out.println("Price set successfully: $" + price);
        } else {
            System.out.println("Error: Price must be between 100 and 100,000.");
        }
    }

    // Getter to retrieve the price
    public double getPrice() {
        return price;
    }
}

public class producttest {
    public static void main(String[] args) {
        Product laptop = new Product();

        // Testing range limits
        laptop.setPrice(50);       // Too low
        laptop.setPrice(1500);     // Valid
        laptop.setPrice(200000);   // Too high
    }
}