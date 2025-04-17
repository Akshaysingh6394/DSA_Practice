import java.util.ArrayList;

public class rotatebykth {
    public static void rotatekth(int nums[],int k){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int temp[] = new int[n];
        int s =0;
        for (int i = n-k; i < n; i++) {
            temp[s]=nums[i];
            s++;
        }
        for (int i = 0; i < n-k; i++) {
            temp[s]=nums[i];
            s++;
        }
        for (int i = 0; i < s; i++) {
            list.add(temp[i]);
        }
        System.out.print(list);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int k=2;
        rotatekth(nums, k);
    }
    
}
