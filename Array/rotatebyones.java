public class rotatebyones {
    public static void leftRotate(int arr[],int n){
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i-1] = arr[i];
            
        }
        temp[n-1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        leftRotate(arr, n);
    }
    
}
