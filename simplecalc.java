public class simplecalc {
    public static void main(String[] args) {
        double n1 = 10, n2 = 5;
        char operator = '+';

        switch (operator) {
            case '+': System.out.println("Result: " + (n1 + n2)); break;
            case '-': System.out.println("Result: " + (n1 - n2)); break;
            case '*': System.out.println("Result: " + (n1 * n2)); break;
            case '/': System.out.println("Result: " + (n1 / n2)); break;
            default: System.out.println("Invalid Operator");
        }
    }
}