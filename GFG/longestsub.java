package GFG;

public class longestsub {
        public static int longestSubarray(int[] arr) {
            // code here
            int maxlength = 0;
            for(int i=0;i<arr.length;i++){
                int maxVal = 0; 
                for(int j=i;j<arr.length;j++){
                    maxVal = Math.max(maxVal,arr[j]);
                    int length = j-i+1;
                    if(maxVal<=length){
                        maxlength = Math.max(maxlength,length);
                    }
                }
            }
            return maxlength;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3};
            System.out.println(longestSubarray(arr));
        }
    }
    

