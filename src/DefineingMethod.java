public class DefineingMethod {
    public static void main(String[] args) {
        // Calling the method to calculate the sum of two numbers
        int result = addNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);

        // Calling the method to print a message
        printMessage("Hello, this is a custom message!");
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method to print a message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
