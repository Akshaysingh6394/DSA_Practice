

public class spiral {
    public static void spiralMAtric(int matrics[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrics.length-1;
        int endCol = matrics[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){
            //TOP
            for (int j = startCol; j < endCol; j++) {
                System.out.print(matrics[startRow][j]);
            }
            //RIGHT
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrics[i][endCol]);
                
            }
            //BOTTOM
            for (int j = endCol-1; j >= startCol; j--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrics[endRow][j]);
                
            }
            //LEFT
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrics[i][startCol]);
                
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrics[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // for (int i = 0; i < matrics.length; i++) {
        //     for (int j = 0; j < matrics.length; j++) {
        //         System.out.print(matrics[i][j]);
        //     }
        //     System.out.println();
            
        //}
   spiralMAtric(matrics);

        
    }
    
}
