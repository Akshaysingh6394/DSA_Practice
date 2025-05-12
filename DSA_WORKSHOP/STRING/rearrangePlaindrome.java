

public class rearrangePlaindrome {
    public static void main(String[] args) {
        String str = "carrace";
        int count = 0;
        int frea[] = new int[26];
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            frea[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frea[i]%2 !=0){
                count++;
            }
        }
        if(count<=1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
