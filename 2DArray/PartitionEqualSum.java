public class PartitionEqualSum {
    public static boolean subSetSum(int arr[]){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        if(sum%2!=0) return false;
        int x = sum/2;
        return solve(arr,0,x);
    }
    public static boolean solve(int arr[],int i,int x){
        if(x==0){
            return true;
        }
        if(i>=arr.length){
            return false;
        }
        boolean take = solve(arr, i+1, x-arr[i]);
        boolean nottake = solve(arr, i+1, x);
        return take||nottake;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1};
        System.out.println(subSetSum(arr));
        
    }
    
}
