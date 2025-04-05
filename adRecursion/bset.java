package adRecursion;

import java.util.ArrayList;
import java.util.List;

public class bset {
     public static void subset(int arr[], int i, List<Integer> curr){
        if (i == arr.length) {
            System.out.print(curr);
            return;
        }

        // Exclude the current element
        subset(arr, i + 1, curr);

        // Include the current element
        curr.add(arr[i]);
        subset(arr, i + 1, curr);
        curr.remove(curr.size() - 1); // Backtrack
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        subset(arr, 0, new ArrayList<>());
    }

    
}
