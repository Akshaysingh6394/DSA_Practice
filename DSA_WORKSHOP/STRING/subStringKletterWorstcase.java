public class subStringKletterWorstcase {
    public static int lengthOfStr(String str, int k) {
        int n = str.length();
        int maxLen = 0;

        for (int left = 0; left < n; left++) {
            int[] freq = new int[26];
            int distinct = 0;

            for (int right = left; right < n; right++) {
                char ch = str.charAt(right);
                if (freq[ch - 'a'] == 0) {
                    distinct++;
                }
                freq[ch - 'a']++;

                if (distinct == k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                } else if (distinct > k) {
                    break; // No need to continue if distinct chars exceed k
                }
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcaba";
        System.out.println((int) lengthOfStr(str, 2));
    }
    
}
