public class makeingHash {
    public static void main(String[] args) {
        
        String s = "aabbbccdeeaa";
        System.out.println(transform(s));
    }

    public static String transform(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int j = i;
            while(j<n && s.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j-i >= 2){
                if(sb.length() == 0 || sb.charAt(sb.length()-1) != '#'){
                    sb.append('#');
                }
            }else{
                sb.append(s.charAt(i));
            }
            i = j-1;
        }
        return sb.toString();
    }
    
}
