package Recursion;

public class lastoccu {
    public static int firstOcur(int arr[],int key , int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcur(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,8};
        int i = arr.length;
        System.out.println(firstOcur(arr, 5, i));
        
    }
    

    
}
