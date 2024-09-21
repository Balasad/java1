public class ShiAsh {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows to print
        for (int i = rows; i >= 1; i--) {  
            for (int j = 5; j >= i; j--) {  
                System.out.print(j);  
            }
            System.out.println(); 
        }
    }
}
