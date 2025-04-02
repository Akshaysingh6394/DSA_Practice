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
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        incre(n-1);
        incre(n-1);
        
    }
    public static void main(String[] args) {
        int n = 3;
        incre(n);
    }
    
}
