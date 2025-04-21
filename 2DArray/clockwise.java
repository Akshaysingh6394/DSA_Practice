
public class clockwise {
    public static void clockwise(int arr[][]){
        int k=arr.length-1;
        int n=arr.length;
        int m=arr[0].length;
        int temp[][] = new int[n][m];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                temp[j][k] = arr[i][j];   
            }
            k--;
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        clockwise(arr);
    }
    
}
