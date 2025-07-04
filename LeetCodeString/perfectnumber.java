public class perfectnumber{
    public static boolean pfnum(int n){
      int sum = 0;
        for(int i=1;i< n;i++){
            if(n%i==0){
                sum +=i;
            }
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
 
        for(int i=1;i<=500;i++){
            if(pfnum(i) == true){
                System.out.print(i+" ");
            }
        }
        
    }
}