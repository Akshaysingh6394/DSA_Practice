package BitManypulation;

public class count {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        
        while(n!=0){
            int rmsb = n & -n;
            n-=rmsb;
            count++;
        }
        System.out.println(count);
    }
    
}
