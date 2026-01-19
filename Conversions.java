public class Conversions {
    public static void main(String[] args) {
        // Celsius to Fahrenheit
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F");

        // Kilometers to Miles
        double km = 10.0;
        double miles = km * 0.621371;
        System.out.println(km + " km is " + miles + " miles");
    }
}