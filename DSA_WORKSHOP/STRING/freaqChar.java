
public class freaqChar{
    public static void main(String[] args) {
        String str = "madammad";
        int freaq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freaq[ch-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(freaq[i]>0){
                char ch = (char) (i+'a');
                System.out.println(ch +" "+freaq[i]);
            }
        }
    }
}