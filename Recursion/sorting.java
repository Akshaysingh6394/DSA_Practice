package Recursion;

import java.util.Arrays;

public class sorting {
    public static int[] sortingArr(int arr[] , int i,int n)
{
    if(i==n-1){
        return arr;
    }
    if(i<n){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            
        }
         sortingArr(arr, i+1,n);
    }
    if(arr[i]<arr[i+1]){
             sortingArr(arr, 0,n-1);
        }


    
    
    return arr;
    
}
public static void main(String[] args) {
        int arr[] = {3,6,4,1,9};
        int n  = arr.length;
        int[] sor = sortingArr(arr, 0,n);
        System.out.println(Arrays.toString(sor));
    }
    
}
