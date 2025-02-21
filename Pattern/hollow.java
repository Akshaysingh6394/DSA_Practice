package Pattern;

public class hollow {
    public static void main(String[] args) {
        
    
    int r =5;
    int c = 6;
    for(int i = 0;i<=r;i++){
        for (int j = 0; j <=c; j++) {
            if(i==0 || i==r || j==0 ||j==c){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();

    }
}
}
