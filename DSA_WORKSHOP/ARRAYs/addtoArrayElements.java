
import java.util.*;

public class addtoArrayElements {
    public static void main(String[] args) {
        int arr1[] = {3,4,8};
        int arr2[] = {4,3,2};
        int  bit = 0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        ArrayList<Integer> res  = new ArrayList<>();
        while(i>=0 || j>=0 || bit>0){
            int sum = bit;
            if (i >= 0) {
                sum += arr1[i--];
            }
            if (j >= 0) {
                sum += arr2[j--];
            }
            res.add(sum % 10);
            bit = sum / 10;
        }
        Collections.reverse(res);
        System.out.println(res);
    }
    
}
