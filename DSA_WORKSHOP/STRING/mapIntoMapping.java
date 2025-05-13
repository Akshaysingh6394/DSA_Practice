public class mapIntoMapping {
    static final int M = (int)1e9 + 7;

    public static int lengthAfterTransformations(String s, int t) {
            int[] mp = new int[26];  // frequency array
    
            // Count frequencies of characters in the string
            for (char ch : s.toCharArray()) {
                mp[ch - 'a']++;
            }
    
            for (int count = 1; count <= t; count++) {
                int[] temp = new int[26];
    
                for (int i = 0; i < 26; i++) {
                    char ch = (char)(i + 'a');
                    int freq = mp[i];
    
                    if (ch != 'z') {
                        temp[ch - 'a' + 1] = (temp[ch - 'a' + 1] + freq) % M;
                    } else {
                        temp['a' - 'a'] = (temp['a' - 'a'] + freq) % M;
                        temp['b' - 'a'] = (temp['b' - 'a'] + freq) % M;
                    }
                }
    
                mp = temp;  // move result back to main frequency array
            }
    
            // Sum of all character frequencies after transformations
            int result = 0;
            for (int i = 0; i < 26; i++) {
                result = (result + mp[i]) % M;
            }
    
            return result;
        }
        public static void main(String[] args) {
            // String str = "aabcy";
            // int t=2;
            System.out.println( lengthAfterTransformations("aabcdy",2));
    }
    
}
