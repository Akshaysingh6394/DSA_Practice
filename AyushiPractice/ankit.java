package AyushiPractice;

public class ankit {
    public static void Rev(int n){
        // int rev = 0;
        // while(n>0){
        //     int rem = n%10;
        //     rev = rev*10+rem;
        //     n/=10;
        // }
        // System.out.println(rev);
        if(n==0){

            return;
        }
        int rem = n%10;
        System.out.print(rem);
        Rev(n/10);
    }
    public static void main(String[] args) {
        int n = 123;
        Rev(n);
      
    }
    
}
