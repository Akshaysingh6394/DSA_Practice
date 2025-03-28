package Recursion;


public class decpattern {
    public static void Pat(int i,int n){
        if(i>=n){
            System.out.println("*");
            return;
        }
        Pat(i+1, n-1);
        System.out.printl("*");

    }
    public static void main(String[] args) {
        Pat(0, 4);
    }

    
}
