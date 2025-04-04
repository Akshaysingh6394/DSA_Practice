package Pattern;

 
public class numberPattern {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern
        for (int i = 0; i < n; i++) { // Loop for rows
            for (int j = 0; j < n; j++) { // Loop for columns
                int num = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j)) + 1;
                System.out.print(num);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
