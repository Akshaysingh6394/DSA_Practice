package DSA_WORKSHOP.ARRAYs;

public class twoelesubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4};
        int k = 3;
        //int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
    
}
