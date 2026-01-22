package encapsulation;

class Customer {
    // Private: name, age
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    // Setter restricts age >= 18
    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Validation Error: Customer must be at least 18 years old.");
        }
    }

    // Getter returns formatted data
    public String getFormattedProfile() {
        if (name == null || age == 0) {
            return "Profile incomplete.";
        }
        return "Customer Profile: [Name: " + name + " | Age: " + age + "]";
    }
}

public class customertest {
    public static void main(String[] args) {
        Customer client = new Customer();
        client.setName("John Doe");
        
        // Testing age validation
        client.setAge(16); // Will show error
        client.setAge(25); // Will accept
        
        // Displaying formatted data
        System.out.println(client.getFormattedProfile());
    }
}
