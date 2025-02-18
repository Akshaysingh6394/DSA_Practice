package Pattern;

public class count {
    public static void main(String[] args) {
        
        for (int i = 0; i < 6; i++) {
            int count =1;
            for (int j = 0; j < i; j++) {
                System.out.print(count);
                count++;
                
            }
            
            System.out.println();
        }
    }
    
}
