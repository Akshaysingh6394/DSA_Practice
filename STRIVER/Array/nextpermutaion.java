public class nextpermutaion {
    public static void swap(int []arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[],int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void nextGreater(int[] arr){
        int gola_index = -1;
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i-1]<arr[i]){
                gola_index=i-1;
                break;
            }
        }
        if(gola_index != -1){
        int swap_index=gola_index;
        for(int j=n-1;j>gola_index;j--){
            if(arr[j]>arr[gola_index]){
                swap_index = j;
                break;
            }
        }
        swap(arr,gola_index,swap_index);
    }
    reverse(arr,gola_index+1,n-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextGreater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
}
