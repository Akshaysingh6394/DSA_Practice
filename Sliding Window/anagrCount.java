import java.util.*;
public class anagrCount {
    public static boolean allZeros(int arr[]){
        for(int num :arr){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> searc(String txt,String pat){
        int n = txt.length();
        int frea[] = new int[26];
        for (int i = 0; i < pat.length(); i++) {
            char ch = pat.charAt(i);
            frea[ch-'a']++;
        }
        int i=0 , j=0 ;
        List<Integer> result = new ArrayList<>();
        int k = pat.length();
        while(j<n){
            frea[txt.charAt(j)-'a']--;
            if((j-i+1) == k){
                if(allZeros(frea)){
                    result.add(i);
                }
                frea[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
            
        }
        return result;
    }
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String Pat = "for";
        
        System.out.println(searc(txt, Pat));
    }
    
}

