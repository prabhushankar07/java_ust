package encapsulation;

// Save this file exactly as: Policy.java
public class insurance {
    // Private variables
    private String policyId;
    private double premium;

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    // Premium calculated internally based on age
    public void setPremiumBasedOnAge(int age) {
        if (age < 18) {
            this.premium = 1000; // Low risk
        } else if (age < 50) {
            this.premium = 3000; // Standard risk
        } else {
            this.premium = 5000; // High risk
        }
    }

    public void displayPolicy() {
        System.out.println("Policy ID: " + policyId);
        System.out.println("Calculated Premium: " + premium);
    }

    public static void main(String[] args) {
        insurance p = new insurance();
        p.setPolicyId("XYZ123");
        p.setPremiumBasedOnAge(35);
        p.displayPolicy();
    }
}
