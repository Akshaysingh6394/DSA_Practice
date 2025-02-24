
public class removeduplicate {
    public static int removedipl(int arr[]){
        int i =0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            
            
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,3,3,4,4,7,9,9,9,9};
        int k = removedipl(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }
}

