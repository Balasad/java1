import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
        double balance = 1000;  // Initial balance

        while (true) {
            System.out.println("\nWelcome to the ATM!");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();  // Get user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();  // Get withdrawal amount
                    if (withdrawAmount > balance) {  // Check if sufficient balance is available
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;  // Deduct amount from balance
                        System.out.println("Withdrawal successful. Remaining balance: " + balance);
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();  // Get deposit amount
                    balance += depositAmount;  // Add amount to balance
                    System.out.println("Deposit successful. Updated balance: " + balance);
                    break;
                case 3:
                    System.out.println("Your current balance: " + balance);  // Show current balance
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");  // Exit message
                    System.exit(0);  // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");  // Handle invalid input
            }
        }
    }
}
