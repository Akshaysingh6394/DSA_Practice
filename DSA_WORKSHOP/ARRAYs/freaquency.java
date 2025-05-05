package DSA_WORKSHOP.ARRAYs;

public class freaquency {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,2,3,3};
        //int i = 0;
        for (int i = 0; i < arr.length; i++) {
            
        
        // while(i<arr.length){
            int curr = arr[i];
            int count = 0;
            while(i<arr.length && arr[i]==curr){
                i++;
                count++;
            }
            System.out.println(curr+" "+"count is"+" "+count);
        }
        
    
    }
    
}
