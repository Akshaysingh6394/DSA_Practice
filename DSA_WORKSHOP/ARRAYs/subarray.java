package DSA_WORKSHOP.ARRAYs;

public class subarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4,5};
        double maxAvg = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j <=arr.length-1; j++) {
                sum += arr[j];
                int len = j - i + 1;
                double avg = (double) sum / len;
                if (avg > maxAvg) {
                    maxAvg = avg;
                }
            }
        }

        System.out.println("Maximum average of any subarray is: " + maxAvg);
    
    }
    
}
