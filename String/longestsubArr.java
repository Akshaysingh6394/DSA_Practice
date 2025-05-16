package String;

public class longestsubArr {
    public static void longestSUB(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int max = 0;
        int maxStart = 0;
        for (int i = 0; i < ch.length; i++) {
            // Check if str.charAt(i) appeared before between start and i-1
            for (int j = start; j < i; j++) {
                if (ch[i] == ch[j]) {
                    start = j + 1;  // move start to one after the duplicate
                    break;
                }
            }
            // Update max length if needed
            int len = i - start + 1;
            if (len > max) {
                max = len;
                maxStart= start;
            }
        }
        System.out.println("Length of longest substring with distinct characters: " + max);
        System.out.println(str.substring(maxStart, max));
        
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        longestSUB(str);
    }
}
