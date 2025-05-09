package DSA_WORKSHOP.STRING;

public class triangle {
    public static void printTria(String str){
        int j=0;
        for(int i=1;i<=str.length();i++){
            System.out.println(str.substring(j, i));
        }
    }
    public static void main(String[] args) {
        String str = "hello";
        printTria(str);
    }
    
}
