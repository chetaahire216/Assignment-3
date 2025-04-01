public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000 are:");
        
        for (int num = 1; num <= 1000; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;
        
        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Calculate sum of digits raised to the power of total digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }
}
