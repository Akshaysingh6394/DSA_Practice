package AyushiPractice;


public class prime {
        public static void maxdifference(int arr[]){
            int sum=0;
            int min = arr[0];
            
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]>min){
                    sum = Math.max(sum,arr[j]-min);
                }else{
                    min = arr[j];
                }   
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[] = {6,4,7,2,4,13};
        maxdifference(arr);

    }
}
