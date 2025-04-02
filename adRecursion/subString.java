package adRecursion;

public class subString {
    public static void subSe(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSe(p+ch, up.substring(1));
        subSe(p, up.substring(1));
        
        
    }
    public static void main(String[] args) {
        subSe(" ", "abc");
    }
    
}
