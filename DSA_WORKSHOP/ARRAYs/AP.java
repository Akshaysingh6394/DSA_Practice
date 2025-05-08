
public class AP{
    public static int findMissing(int[] arr) {
        // code here
        int n = arr.length;
        int diff = arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1]) != diff){
                return arr[i-1]+diff;
                

            }
            
        }
        return arr[n-1]+diff;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 12, 14};
        System.out.println(findMissing(arr));
        
    }
}