public class twisum {
    // public static int[] twoSum(int nums[], int target){
    //     int arr[] = new int[2];
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if(nums[i]+nums[j]==target){
    //                 arr[0]=i;
    //                 arr[1]=j;
    //             }
    //         }
            
    //     }
    //     return arr;
    // }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int target = 7;
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    arr[0]=nums[i];
                    arr[1]=nums[j];
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
     
      
        
    }
    
}
