public class duplicate {
    public static void dupli(int arr[] , int n){
        
    }
    public static int main(String[] args) {
        int arr[] = {1,2,3,3,3,4,4,4,5,5,5,7};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
            System.out.println(i+1);
            
        }
    }
    
}
