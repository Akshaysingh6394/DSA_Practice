package AyushiPractice;

public class countOcc {
    public static int couuntOccu(String str){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='f'){
                count1++;
            }
            if(str.charAt(i)=='f'){
                count2++;
            }
            if(str.charAt(i)=='f'){
                count3++;
            }
            
        }
        return Math.min(count1,Math.min(count2,count3));

    }
    public static void main(String[] args) {
        System.out.println(couuntOccu(("oolkslffksnkdrrrr")));
        
    }
    
}
