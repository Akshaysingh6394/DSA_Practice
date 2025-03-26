public class sorting {
    public static void sorti(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,9,3,6,4,1};
        sorti(arr);
    }
    
}
