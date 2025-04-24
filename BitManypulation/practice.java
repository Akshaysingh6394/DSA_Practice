package BitManypulation;

public class practice {
    public static void main(String[] args) {
        int start = 3;
        int goal = 4;
        int xor = start ^ goal;
        int flip = 0;
        while(xor>0){
            if((xor & 1) ==1){
                flip++;
            }
            xor = xor>>1;

    }
    System.out.println(flip);

    }
    
}
