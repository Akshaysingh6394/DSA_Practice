package BitManypulation;

public class countSetBit {
    public static void countSetBi(int n,int c){
        // if(n==0){
        //     System.out.println(c);
        //     return ;
            

        // }
        // if( (n & 1)!=0){
        //      countSetBi(n>>1, c+1);
        // }else{
        //     countSetBi(n>>1, c);
        // }
        while(n>0){
            if((n&1)!=0){
                c++;
                
            }
            n = n>>1;
            
           
        }
        System.out.println(c);

            
        
    }
    public static void main(String[] args) {
        countSetBi(10, 0);
        
    }
    
}
