public class nearestPrime {
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 99;
        int up = n;
        while(!isPrime(up)){
            up++;
        }

       
        int down = n;
        while(down > 1 && !isPrime(down)){
            down--;
        }

        if((n - down) <= (up - n)){
            System.out.println((n-down));
        } else {
            System.out.println((n-up));
        }
    }
    
}
