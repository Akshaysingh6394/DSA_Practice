public class evenMOdd {
    public static void main(String[] args) {
        String str = "aabbaabccd";
        int frea[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            frea[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frea[i]>0){
                System.out.println(frea[i] + " "+(char)i+'a');
            }
        }
    }
    
}
