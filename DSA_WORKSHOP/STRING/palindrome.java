package DSA_WORKSHOP.STRING;

public class palindrome {
    public static boolean checkPalindrone(String str){
        if(str.length() ==0){
            return false;
        }
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrone(str));
    }
    
}
