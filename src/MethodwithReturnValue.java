public class MethodwithReturnValue {
    public static void main(String[] args) {
        int number = 5;
        int result = square(number); // Call the method and store the result
        System.out.println("The square of " + number + " is: " + result);
    }

    // Method to calculate the square of a number
    public static int square(int num) {
        return num * num; // Return the square of the number
    }
}
