public class PalindromeNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 1000 are:");
        
        for (int num = 1; num <= 1000; num++) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num, reversedNum = 0, remainder;

        while (num > 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
