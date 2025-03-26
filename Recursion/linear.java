package Recursion;

public class linear {
    public static void linearSearch(int arr[],int target,int i){
        if(arr[i]==target){
            System.out.println(i);
            return ;
        }
        linearSearch(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8,0};
        int target = 8;
        linearSearch(arr, target, 0);
        

    }
    
}
