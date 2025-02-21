package Pattern;

public class ultaprca {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i <= n-1; i++) {
            
            
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
         
            }
            for (int j = 1; j <= 2*(n-i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
        
    }
    
}
