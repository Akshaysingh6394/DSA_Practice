package Recursion;
import java.util.*;

public class linearTwo {
    static ArrayList<Integer> listPrint(int arr[],int target,int i,ArrayList<Integer> list){
        if(i==arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return  listPrint(arr, target, i+1, list);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6};
        int target = 4;
        // ArrayList<Integer> list = new ArrayList<>();
        System.out.println(listPrint(arr, target, 0, new ArrayList<>()));
        
    }
    
}
