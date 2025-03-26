package Recursion;

public class tiling {
    public static int tilingfloar(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int vertically = tilingfloar(n-1);
        int horizently = tilingfloar(n-2);
        return vertically+horizently;
    }
    public static void main(String[] args) {
        System.out.println(tilingfloar(4));
        
    }
    
}
