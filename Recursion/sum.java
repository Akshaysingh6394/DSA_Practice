package Recursion;

public class sum {
    // public static int sumOfNaturalNumbers(int n){
    //     if(n==1){
    //         // System.out.println(1);
    //         return 1;
    //     }
    //     int smn =n+sumOfNaturalNumbers(n-1);
    //     return smn;
    // }
    // public static void main(String[] args) {
    //     int n =5;
    //     System.out.println(sumOfNaturalNumbers(n));
    // }
    public static void sumof(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumof(n-1, sum+n);
    }
    public static void main(String[] args) {
      
        sumof(5, 0);
    }
    
}
