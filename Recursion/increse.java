package Recursion;

public class increse {
    public static void increseOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        increseOrder( n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        int n = 10;
        increseOrder(n);
    }
    
}
