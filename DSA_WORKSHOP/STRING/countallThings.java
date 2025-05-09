package DSA_WORKSHOP.STRING;
import java.util.*;

public class countallThings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int wordCount = 0;
        if (!str.trim().isEmpty()) {
            wordCount = str.trim().split("\\s+").length;
        }
        System.out.println(wordCount);
        int digitCount = 0;
        int spaceCount = 0;

        // Loop through each character
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);

        //     if (Character.isDigit(ch)) {
        //         digitCount++;
        //     } else if (Character.isSpaceChar(ch)) {
        //         spaceCount++;
        //     }
        // }
        // System.out.println(spaceCount+1);

    }
    
}
