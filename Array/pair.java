public class pair {
    public static int pairs(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
            System.out.println(arr[i]+","+arr[j]);   
            sum+=arr[i]+arr[j];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                return 0;
            } 
            
                       
              
                           
        }
   
        
            
        }
        return maxSum;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int maxi = pairs(arr);
        System.out.println(maxi);

    }
}
