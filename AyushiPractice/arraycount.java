
public class arraycount{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,5,5,6};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int count =1;
            int curr = arr[i];
            while(i<n-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+" "+"is"+" "+count);
        }
    }
}