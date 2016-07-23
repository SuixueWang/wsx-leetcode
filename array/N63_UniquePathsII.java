public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int [][] Paths = new int[m][n];
        
        if(obstacleGrid[0][0] == 1){
            return 0;
        }else{
            Paths[0][0] = 1;
        }
        
        for(int i = 1; i<m; i++){
            if(obstacleGrid[i][0] == 1){
                
                while(i<m){
                    Paths[i][0] = 0;
                    i++;
                }
                continue;
            }else{
                Paths[i][0] = 1;
            }
            
        }
            
        
        for(int i = 1; i<n; i++){
            if(obstacleGrid[0][i] == 1){
                
                while(i<n){
                    Paths[0][i] = 0;
                    i++;
                }
                continue;
            }else{
                Paths[0][i] = 1;
            }
        }
            
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(obstacleGrid[i][j] == 1){
                    Paths[i][j] = 0;
                }else{
                    Paths[i][j] = Paths[i-1][j] + Paths[i][j-1];
                }
                
            }
        }
        
        return Paths[m-1][n-1];
    }
}