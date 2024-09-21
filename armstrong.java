public class ArmstrongNumbers {
    public static void main(String[] args) {
        int start = 50;  // Starting range
        int end = 500;   // Ending range
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {  // Loop through the range
            if (isArmstrong(i)) {  // Check if the number is an Armstrong number
                System.out.println(i);  // Print the Armstrong number
            }
        }
    }
    
    public static boolean isArmstrong(int num) {
        int originalNum = num;  // Store the original number
        int sum = 0;            // Initialize sum to 0
        int numDigits = String.valueOf(num).length();  // Get the number of digits
        
        // Calculate the sum of the digits raised to the power of numDigits
        while (num > 0) {
            int digit = num % 10;  // Get the last digit
            sum += Math.pow(digit, numDigits);  // Raise digit to the power and add to sum
            num /= 10;  // Remove the last digit
        }
        
        return sum == originalNum;  // Return true if the sum equals the original number
    }
}
