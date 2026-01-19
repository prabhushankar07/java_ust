public class simpleinterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.5;
        double time = 2.0; // in years

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}