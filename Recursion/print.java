package Recursion;
public class print {
    static void printNumbers(int n) {
        if (n<0) { // Base case: Stop when current exceeds n
            return;
        }
        //System.out.println(current); // Print the current number
        printNumbers(n-1); // Recursive call with incremented number
    }

    public static void main(String[] args) {
        int n = 10; // Change this value as needed
        printNumbers(n); // Call the function starting from 1
    }
    
}
