package Recursion;

public class linear {
    public static int linearSearch(int arr[],int target,int i){
        if(arr[i]==target){
            return i;
        }
        return linearSearch(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8,0};
        int target = 8;
        System.out.println(linearSearch(arr, target, 0));
        

    }
    
}
