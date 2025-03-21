package Recursion;

public class decrease {
    public static int decreaseOrder(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        int dec = decreaseOrder(n-1);
        return dec;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(decreaseOrder(n));
    }
    
}
