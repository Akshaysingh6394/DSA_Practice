package AyushiPractice;

public class rev {
    public static int rev(int n){  
        int rev =0;      
      while(n>0){
        int rem = n%10;
        rev = rev*10 +rem;
        n = n/10;
      }
      return rev;

     
    }
    public static void main(String[] args) {
        System.out.println(rev(123));
        
        
    }
    
}
