package encapsulation;

class Mobile {
    // Private variables
    private String brand;
    private double price;

    // Setters to initialize data
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter returns price with GST (assuming 18% GST)
    public double getPriceWithGST() {
        double gstRate = 0.18;
        return price + (price * gstRate);
    }

    public String getBrand() {
        return brand;
    }
}

public class mobiletest {
    public static void main(String[] args) {
        Mobile myPhone = new Mobile();
        myPhone.setBrand("Samsung");
        myPhone.setPrice(50000);

        System.out.println("Brand: " + myPhone.getBrand());
        System.out.println("Price (incl. GST): " + myPhone.getPriceWithGST());
    }
}
