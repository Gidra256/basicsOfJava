public class WhileLloop {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        // Using while loop to calculate the sum of numbers from 1 to 10
        while (i < 10) {
            i++;
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to 10 is: " + sum);

        // Using do-while loop to ensure the loop runs at least once
        int j = 0;
        do {
            j++;
            System.out.println("This will print at least once, even if j is initially 0.");
        } while (j < 0);
    }
}
