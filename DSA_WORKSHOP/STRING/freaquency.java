package DSA_WORKSHOP.STRING;

import java.util.Scanner;

public class freaquency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Optional: convert to lowercase for case-insensitive counting
        str = str.toLowerCase();

        // Array to store frequency of characters (0-255 for ASCII)
        int[] freq = new int[256];

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        // Display frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
    
}
