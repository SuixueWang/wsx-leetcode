public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length < 1 || grid[0].length < 1){
            return 0;
        }
        
        int rows = grid.length;
        int columns = grid[0].length;
        int [][] minSum = new int[rows][columns];
        
        minSum[0][0] = grid[0][0];
        
        // The first row
        for(int j = 1; j < columns; j++){
            minSum[0][j] = minSum[0][j-1] + grid[0][j];
        }
        
       // The first column
        for(int i = 1; i < rows; i++){
            minSum[i][0] = minSum[i-1][0] + grid[i][0];
        }
        
        for(int i = 1; i < rows ; i++){
            for(int j = 1; j < columns; j++){
                minSum[i][j] = Math.min( minSum[i][j-1], minSum[i-1][j] ) + grid[i][j];
            }
        }
        
        
        return minSum[rows-1][columns-1];        
    }
}