package BitManypulation;

public class countsetBItSecondMethod {
    public static void main(String[] args) {
        int n= 21;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while(n>0){
            
            // n -= (n & -n);
            n = (n & n-1);
            count++;
            
        }
        System.out.println(count);
    }
    
}
