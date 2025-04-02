package adRecursion;

public class skipApple {
    public static void skipAppleInString(String s){
        if(s.isEmpty()){
            return;
        }
        if(s.startsWith("apple")){
            skipAppleInString(s.substring(5));
        }else{
            
            System.out.print(s.charAt(0));
            skipAppleInString(s.substring(1));
        }
    }
    public static void main(String[] args) {
        skipAppleInString("fhfapplendh");
    }
    
}
