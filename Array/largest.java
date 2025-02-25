// import java.util.*;
public class largest {
    public static void main(String[] args) {
        int max = 0;
        int n[]={2,5,4,7,8};
        for (int i = 0; i < n.length; i++) {
            if(n[i]>max){
                max = n[i];
            }
        }
        System.out.println(max);
        
    }
    
}
