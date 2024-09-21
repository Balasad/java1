import java.util.Scanner;

public class MatrixEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of rows:");
            int rows = scanner.nextInt();
            System.out.println("Enter the number of columns:");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

            System.out.println("Enter the elements of the matrix:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            if (isTransposeEqual(matrix, rows, columns)) {
                System.out.println("The matrix is equal to its transpose.");
            } else {
                System.out.println("The matrix is not equal to its transpose.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    public static boolean isTransposeEqual(int[][] matrix, int rows, int columns) {
        if (rows != columns) {
            return false; // A non-square matrix cannot be equal to its transpose
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // If any element doesn't match its transpose, return false
                }
            }
        }
        return true; // All elements match
    }
}
