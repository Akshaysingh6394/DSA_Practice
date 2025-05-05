package DSA_WORKSHOP.ARRAYs;

import java.util.HashSet;

public class distinctssubarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3};

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                // If element already exists, break
                if (set.contains(arr[j])) {
                    break;
                }

                set.add(arr[j]);

                // Print current subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
