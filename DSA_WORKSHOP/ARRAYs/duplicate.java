package DSA_WORKSHOP.ARRAYs;

public class duplicate {
    public static void duplicate(int arr[]){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
            
        }
        int k = j+1;
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,3,4,4,4};
        duplicate(arr);
    }
    
}
