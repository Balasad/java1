public class FibonacciSum {
    public static void main(String[] args) {
        int n = 4; // Number of even indices to consider
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int fib = fibonacci(2 * i);  // Get Fibonacci number at the even index 2*i
            sum += fib;                   // Add to sum
        }
        System.out.println("Sum of Fibonacci series numbers at the first " + n + " even indices: " + sum);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base cases: F(0) = 0, F(1) = 1
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;  // Calculate next Fibonacci number
            a = b;      // Move to next
            b = c;      // Update b to last Fibonacci number
        }
        return b;  // Return the nth Fibonacci number
    }
}
