public class kadans {
    public static int kadansAlgo(int arr[],int n){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,-3,2,-4,5};
        int n = arr.length;
        int maxsubArr = kadansAlgo(arr, n);
        System.out.println(maxsubArr);
        
    }
    
}
