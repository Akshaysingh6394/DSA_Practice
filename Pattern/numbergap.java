package Pattern;

public class numbergap {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            for (int j = 1; j < 2*n-2*i; j++) {
                System.out.print(" ");
                
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
                
            }
            System.out.println();
            
        }
    }
    
}
