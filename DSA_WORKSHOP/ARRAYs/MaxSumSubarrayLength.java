package DSA_WORKSHOP.ARRAYs;

public class MaxSumSubarrayLength {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        int length = end - start + 1;

        System.out.println(length);
    }
}
