package Recursion;

public class increse {
    // public static int increseOrder(int n){
    //     if(n==1){
    //        System.out.println(1); 
    //        return 1;
    //     }
        
    //     int inc = increseOrder(n-1);
    //     System.out.print(n);
    //     return inc;
        

    // }
    public static void incre(int n){
        if(n<1){
            return;
        }
        incre(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        incre(n);
    }
    
}
