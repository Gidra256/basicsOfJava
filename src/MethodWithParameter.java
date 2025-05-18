public class MethodWithParameter {
    public static void main(String[] args) {
        // Calling the method with different parameters
        int result1 = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result1);

        int result2 = add(20, 30);
        System.out.println("The sum of 20 and 30 is: " + result2);
    }

    // Method that takes two integers as parameters and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }
}
