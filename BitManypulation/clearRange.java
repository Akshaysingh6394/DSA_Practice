package BitManypulation;

public class clearRange {
    public static int clearRang(int n,int i,int j){
        int bitFirst = (-1)<<j+1;
        int bitSecond = (1<<i)-1;
        int bitFinal = bitFirst|bitSecond;
        int finaValue = n&bitFinal;
        return finaValue;
    }
    public static void main(String[] args) {
        System.out.println(clearRang(10, 2, 4));
        
    }
    
}
