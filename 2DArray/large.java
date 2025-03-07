public class large{
    public static void main(String[] args) {
        int numbr[][] = {{1,2,3},{4,9,6},{7,8,0}};
        int max = Integer.MIN_VALUE;
        for (int[] numbr1 : numbr) {
            for (int j = 0; j < numbr.length; j++) {
                if (numbr1[j] > max) {
                    max = numbr1[j];
                }
            }
        }
        System.out.println(max);

        
    }

}