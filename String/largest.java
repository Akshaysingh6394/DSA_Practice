package String;

public class largest {
    public static String largestCom(String str[]){
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        String str[] = {"Akshay","Krishna","Akash"};
        System.out.println(largestCom(str));
    }
    
}
