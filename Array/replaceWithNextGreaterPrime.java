import java.util.Arrays;

public class replaceWithNextGreaterPrime {
    public static boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0) return false;
            return true;
        }
    
        public static int[] replaceWithNextGreaterPrime(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
    
            for (int i = 0; i < n; i++) {
                int current = arr[i];
                int replacement = -1;
    
                // Check next elements circularly (exclude self)
                for (int j = 1; j < n; j++) {
                    int idx = (i + j) % n;
                    if (arr[idx] > current && isPrime(arr[idx])) {
                        replacement = arr[idx];
                        break;
                    }
                }
    
                result[i] = replacement;
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] arr = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
            int[] result = replaceWithNextGreaterPrime(arr);
            System.out.println(Arrays.toString(result));
        }
    
    
}
