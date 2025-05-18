public class MethodOverloading {
    public static void main(String[] args) {
        // Calling the overloaded methods
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
        System.out.println("Sum of two doubles: " + add(5.5, 10.5));
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }
}
