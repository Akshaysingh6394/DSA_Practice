package Recursion;



public class decpattern {
    public static void Pat(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            Pat(r, c+1);
            System.out.print("*");
        }else{
        
        Pat(r-1, 0);
        System.out.println();
        }
    }
    public static void main(String[] args) {
        Pat(4, 0);
    }

    
}
