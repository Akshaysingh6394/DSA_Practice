package Recursion;

public class pracise {
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        
        print( n+1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        print(1);
    }
    
}
