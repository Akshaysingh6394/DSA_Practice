package DSA_WORKSHOP.ARRAYs;

public class revsubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = j; j2 >= i; j2--) {
                    System.out.print(arr[j2]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
