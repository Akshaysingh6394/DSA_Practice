package BitManypulation;

public class ocuurancethreetimes {
    public static void main(String[] args) {
        int []arr = {7,2,3,2,2,3,3,4,4,4};
        int ans =0;
        for(int num:arr){
            ans = num %3;
        }
        System.out.println(ans);
    }
    
}
