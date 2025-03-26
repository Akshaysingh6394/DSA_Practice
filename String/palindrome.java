package String;

public class palindrome {
    public static boolean checkPalind(String str){
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
            
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkPalind(str));
    }
    
}
