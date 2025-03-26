public class ayushidoubt {
    public static boolean faipas(int arr[],int n){
        int totalMarks = n*100;
        int getMarks = 0;
        for (int i = 0; i < arr.length; i++) {
            getMarks+=arr[i];
        }
        
        int percent = (getMarks*100)/totalMarks;
        if(percent>33){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,7,6,17,25};
        int n = arr.length;
        System.out.println(faipas(arr, n));
        
    }
    
}
