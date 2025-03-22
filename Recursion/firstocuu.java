package Recursion;

public class firstocuu {
    public static int firstOcur(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,8};
        System.out.println(firstOcur(arr, 5, 0));
        
    }
    
}
