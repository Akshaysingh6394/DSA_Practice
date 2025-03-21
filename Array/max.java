


public class max {
    public static void main(String[] args) {
        int arr[] = {-10, -5, -1, -4 ,-2,-3};
        int maxWord = arr[0];
       for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>maxWord){
                maxWord =arr[i];

            }
        }
            
        System.out.println(maxWord);
      int smx = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]!=maxWord){
            if(arr[i]>smx){
                smx =arr[i];
            }
        }
        
      }
      System.out.println(smx);
        }
        
       
       

    }
    
