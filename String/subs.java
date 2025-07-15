package String;

public class subs {
    public static void main(String[] args) {
        String str = "Akshay";
        int n = str.length();
        String ans = str.substring(1,n) +str.substring(0,1);
        System.out.println(ans);
    }
    
}
