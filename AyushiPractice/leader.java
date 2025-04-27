package AyushiPractice;

import java.util.ArrayList;

public class leader {
    public static ArrayList<Integer> leader(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
       // int largest = Integer.MIN_VALUE;
        int i=0;
        while(i<arr.length){
            int largest = arr[i];
            int idx = i;
            for (int j =i+1; j < arr.length; j++) {
                if(arr[j]>largest){
                largest = arr[j]; 
                idx = j;  
                }
            }
           
        list.add(largest);
        i= idx+1;
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,6,7,1,3,2};
        System.out.println(leader(arr));
    }
    
}
