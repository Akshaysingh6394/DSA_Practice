package Recursion;

public class fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibon = fibo(n-1) + fibo(n-2);
        return fibon;
    }
    public static void main(String[] args) {
        int n =6;
        System.out.println(fibo(n));
    }
    
}
