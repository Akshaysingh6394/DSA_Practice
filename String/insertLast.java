import java.util.HashMap;

public class insertLast {
    public static void main(String[] args) {
        String str = "neelesh";
        StringBuilder sb = new StringBuilder();
        HashMap<Character , Integer>map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        String ans = "";
        int fre = 0;
        for(char chh:map.keySet()){
            if(map.get(chh) > 1){
                ans += chh;
                fre = map.get(chh);
            }
        }
        int idx = str.lastIndexOf(ans);
        for(int i=0;i<str.length();i++){
            if(i == idx){
                sb.append(fre);
            }else{

            
            sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    
}
