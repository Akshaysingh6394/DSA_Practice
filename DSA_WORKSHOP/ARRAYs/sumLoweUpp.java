package DSA_WORKSHOP.ARRAYs;

public class sumLoweUpp {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int low = 4;
        int upp = 6;
        int k=2;
        int sum = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            int aans = 0;
            for (int j = i; j < i+k; j++) {
                aans += arr[j];
               
            }
            if(aans > upp){
                sum+=1;
            }
            else if(aans < low){
                sum -= 1;
            }
            
        }
        System.out.println(sum);
    }
    
}
