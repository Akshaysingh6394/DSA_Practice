package adRecursion;

import java.util.ArrayList;
import java.util.List;

public class bset {
     public static void subset(int arr[], int i, List<Integer> curr){
        if (i == arr.length) {
            System.out.print(curr);
            return;
        }

        
        subset(arr, i + 1, curr);
        curr.add(arr[i]);



        subset(arr, i + 1, curr);
        
        curr.remove(curr.size() - 1); // Backtrack
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        subset(arr, 0, new ArrayList<>());
    }

    
}
