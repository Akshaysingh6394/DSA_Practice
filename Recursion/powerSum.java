package Recursion;

public class powerSum {
    static int sumOfSeries(int n) {
        // code here
        int sum = 0;
        if(n==1){
            System.out.println(1);
            return 1;
        }
        return sum+=sumOfSeries((n-1)*(n-1)*(n-1));
    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    
}
