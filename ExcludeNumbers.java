public class ExcludeNumbers {
    public static void main(String[] args) {
        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Skip the numbers 5 and 6
            if (i == 5 || i == 6) {
                continue; // Continue to the next iteration
            }
            // Print the number
            System.out.println(i);
        }
    }
}
