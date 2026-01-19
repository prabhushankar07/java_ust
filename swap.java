public class swap {
    public static void main(String[] args) {
        int x = 10, y = 50;

        // Method A: Using a temporary variable
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Temp Swap: x = " + x + ", y = " + y);

        // Method B: Without a temporary variable (Arithmetic)
        x = x + y; // x becomes 60
        y = x - y; // y becomes 10
        x = x - y; // x becomes 50
        System.out.println("After Math Swap: x = " + x + ", y = " + y);
    }
}