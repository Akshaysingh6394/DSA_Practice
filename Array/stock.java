public class stock {
    public static void maxProfit(int arr[]){
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    maxPro = Math.max(arr[j]-arr[i], maxPro);
                }

            }
        }
        System.out.println(maxPro);
    }
    public static void main(String[] args) {
        int arr[] = {2,7,3,4,5,8,9};
        maxProfit(arr);

    }
}
