package Recursion;

public class practice {
    public static int reverse(int n){
        int rem=0;
        if(n%10==0){
            return 0;
        }
        return  rem*10+(n%10)+reverse(n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    
}
