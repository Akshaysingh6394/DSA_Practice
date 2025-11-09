public class tcs{
    
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int idx = 0;
        int newarr[] = new int[arr.length-k+1];
        for (int i = 0; i < arr.length-k+1; i++) {
            int max = arr[i];
            for(int j=i;j<=i+k-1;j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            newarr[idx++] = max;
            
        }
        
        for(int h=0;h<newarr.length;h++){
            System.out.print(newarr[h]+" ");
        }

    }
}