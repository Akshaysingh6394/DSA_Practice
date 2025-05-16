

public class subStringKletter {
    public static int lengthofstr(String str,int k){
        int[] freq = new int[26];
        int left = 0, right = 0, maxLen = 0, distinct = 0;

        while (right < str.length()) {
            char rChar = str.charAt(right);
            if (freq[rChar - 'a'] == 0) {
                distinct++;
            }
            freq[rChar - 'a']++;
            right++;

            while (distinct > k) {
                char lChar = str.charAt(left);
                freq[lChar - 'a']--;
                if (freq[lChar - 'a'] == 0) {
                    distinct--;
                }
                left++;
            }

            if (distinct == k) {
                maxLen = Math.max(maxLen, right - left);
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcaba";
        System.out.println((char) lengthofstr(str, 2));
    }
    
}
