public class large{
    public static void main(String[] args) {
        int numbr[][] = {{1,2,3},{4,9,6},{7,8,0}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbr.length; i++) {
            for (int j = 0; j < numbr.length; j++) {
                if(numbr[i][j]>max){
                    max=numbr[i][j];

                }
            }
        }
        System.out.println(max);

        
    }

}