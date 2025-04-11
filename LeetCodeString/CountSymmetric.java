package LeetCodeString;

public class CountSymmetric {
    public static int count(int low,int high){
        int count = 0;
        for (int i = low; i < high; i++) {
            String str = Integer.toString(i);
            int len = str.length();
            if(len%2!=0){
                continue;
            }
            int leftHalf = 0;
            int secHalf = 0;
            
            for(int j=0;j<len/2;j++){
                leftHalf += str.charAt(j)-'0';
            }
            for(int j=len/2;j<len;j++){
                secHalf += str.charAt(j)-'0';
            }
            if(leftHalf==secHalf){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count(1, 100));
    }
    
}
