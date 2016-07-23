public class Solution {
    public int[][] generateMatrix(int n) {
        
        int [][] spiralMatrix = new int[n][n];
        
        if(n == 0) {
            return spiralMatrix;
        }
        
        int x1 = 0, y1 = 0;
        
        int rows = n;
        int columns = n;
        
        int num = 1;
        
        while(rows >= 1 && columns >= 1){
            
            int x2 = x1 + rows - 1;
            int y2 = y1 + columns - 1;
            
            //遍历第一行
            for(int i = y1; i <= y2; i++){
                spiralMatrix[x1][i] = num++;
            }
            
          //遍历最右列
            for(int i = x1+1; i < x2; i++){
                spiralMatrix[i][y2] = num++;
            }
            
          //遍历最后一行
            if(rows > 1){
                for(int i = y2; i >= y1; i--){
                    spiralMatrix[x2][i] = num++;
                }
            }
            
            if(columns > 1) {
              //遍历第一列
                for(int i = x2-1; i > x1; i--){
                    spiralMatrix[i][y1] = num++;
                }
            }
            
            x1++;
            y1++;
            
            rows -= 2;
            columns -= 2;
        }
        
        
        return spiralMatrix;        
    
    }
}