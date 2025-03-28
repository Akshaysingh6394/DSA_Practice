package AyushiPractice;

public class dec {
    static void decr(int n){
        if(n==0){
            return;
        }
        decr(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        decr(5);
        
    }
    
}
