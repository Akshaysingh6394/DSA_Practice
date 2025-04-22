package String;

public class compression {
    public static String compr(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char currch = str.charAt(i);
            int count =1;
            while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
            
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbbbbbbbbbbbbbbbssdddeeee";
        System.out.println(compr(str));
    }
    
}
