package encapsulation;

class User {
    // Private variables: email, password
    private String email;
    private String password;

    // Public setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Password setter validates length >= 8
    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Security Error: Password must be at least 8 characters.");
        }
    }

    // Optional: Getter to verify setup (usually you wouldn't return a plain password)
    public String getEmail() {
        return email;
    }
}

public class logintest {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("dev@example.com");

        // Attempting a password that is too short
        user.setPassword("123"); 

        // Setting a valid password
        user.setPassword("securePassword123");
    }
}