package DSA_WORKSHOP.ARRAYs;

public class moveZeros {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,0};
        int count =0 ;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i < arr.length-count+1; i++) {
            if(arr[i]!=0){
                arr[idx] = arr[i];
                idx++;
                
            }
            
        }
        for (int i = idx+1; i < arr.length; i++) {
            arr[idx++]=0;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }
    
}
