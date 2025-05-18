public class BreakAndContinue {
    public static void main(String[] args) {
        // Using break statement to exit a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("i = " + i);
        }

        // Using continue statement to skip an iteration
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                System.out.println("Skipping the iteration at j = " + j);
                continue; // Skip the rest of the loop when j is 5
            }
            System.out.println("j = " + j);
        }
    }
}
