import java.util.*;
public class revmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp /= 10;


        }
        System.out.println(rev);
        double ans = Math.pow(n, rev);
        System.out.println(ans);

    }
    
}
