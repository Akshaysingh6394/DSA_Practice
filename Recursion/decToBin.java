package Recursion;

import AyushiPractice.dec;

public class decToBin {
    public static String dectobin(int n,int b){
        if (n == 0) {
            return "0";  // Edge case for input 0
        }
        return decToBinHelper(n);
    }

    private static String decToBinHelper(int n) {
        if (n == 0) {
            return "";
        }
        return decToBinHelper(n / 2) + (n % 2);
    
    }
    public static void main(String[] args) {
        System.out.println(dectobin(10, 2));
        
    }
    
}
