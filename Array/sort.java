public class sort {
    public static boolean checkSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    return false;
            
                
            }
        }
    }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7};
        System.out.println(checkSort(arr));
    }
    
}
