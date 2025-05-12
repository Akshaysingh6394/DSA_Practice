public class sentencePalindrome {
    public static boolean ispalindrone(String str){
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
        String strsen = "raar is madam racecar";
        String words[] = strsen.split(" ");
        String maxPal="";
        for(String word:words){
            if(ispalindrone(word) && word.length()>maxPal.length()){
                maxPal = word;
            }
        }
        System.out.println(maxPal.length());

    }
    
}
