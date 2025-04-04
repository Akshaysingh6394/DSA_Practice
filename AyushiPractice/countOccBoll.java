package AyushiPractice;

public class countOccBoll {
    public static int OccuranceBall(String str){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='b'){
                count1++;
            }
            if(str.charAt(i)=='a'){
                count2++;
            }
            if(str.charAt(i)=='l'){
                count3++;
            }
            
        }
        return Math.min(count1,Math.min(count2,count3/2));

    }
    public static void main(String[] args) {
        System.out.println(OccuranceBall("bmuabmugaljkjljdrlh"));
    }
    
}
