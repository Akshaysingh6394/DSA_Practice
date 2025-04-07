package AyushiPractice;

public class primeRange {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRang(int l,int u){
        boolean found = false ;
        for(int i=l;i<=u;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
                found = true ;

            }

           
        }
        if ( !found){
            System.out.print("no");
        }
      
    }
    public static void main(String[] args) {
        primeRang(3, 26);
    }
    
}
