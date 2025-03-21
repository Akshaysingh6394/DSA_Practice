package Recursion;

public class sum {
    public static int sumOfNaturalNumbers(int n){
        if(n==1){
            // System.out.println(1);
            return 1;
        }
        int smn =n+sumOfNaturalNumbers(n-1);
        return smn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sumOfNaturalNumbers(n));
    }
    
}
