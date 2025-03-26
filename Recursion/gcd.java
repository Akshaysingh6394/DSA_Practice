package Recursion;

public class gcd {
    static int gcdProblem(int a,int b){
        if(b==0){
            return a;
        }
        return gcdProblem(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcdProblem(6, 4));
    }
    
}
