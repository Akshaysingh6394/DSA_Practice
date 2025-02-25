import java.util.*;
public class inputbyuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i< n; i++) {
            arr[i] = sc.nextInt();
            
        }
        // System.out.println("array number is"+n);
        System.out.println("Array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }

        sc.close();
    }
    
}
