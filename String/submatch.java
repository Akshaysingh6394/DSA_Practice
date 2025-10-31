public class submatch{
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-(needle.length()+1);i++){
            if(haystack.charAt(i) == needle.charAt(0) && haystack.substring(i , needle.length()-1) == needle.substring(i+1)){
                return i;
                

            }
        }
        return -1;
    }
}
