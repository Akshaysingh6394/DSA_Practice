package STRIVER.Array;

public class setMatrixZero {
    public static void setmatrixZEro(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        boolean fr = false;
        boolean fc = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    if(i==0){
                        fr = true;
                    }
                    if(j==0){
                        fc = true;
                    }
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
                
            }
            
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][0]==0  || arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
            
        }
        if(fr){
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
                
            }
        }
        if(fc){
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,0,5},{6,7,8}};
        setmatrixZEro(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
