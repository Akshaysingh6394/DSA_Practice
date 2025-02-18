public class palindrome {

    public static void main(String[] args) {
        int num = 123;
        int rev =0;
        int temp=num;
        int rem;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        System.out.println(rev);
        if(num == rev){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
    
}
