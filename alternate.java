public class AlternatePrimeNumbers {
    public static void main(String[] args) {
        int maxPrime = 50; // User-defined maximum prime number value
        
        printAlternatePrimes(maxPrime);
    }

    public static void printAlternatePrimes(int maxPrime) {
        int count = 0;
        for (int num = 2; num <= maxPrime; num++) {
            if (isPrime(num)) {
                count++;
                if (count % 2 != 0) {
                    System.out.println(num);
                }
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    