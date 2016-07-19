public class Solution {
    public void setZeroes(int[][] matrix) {
    
        // ------------------------------ 算法的空间复杂度O(1) ---------------------------------------
        int m = matrix.length;
        int n = matrix[0].length;
        
        
        boolean row_has_zeros = false; //第一行是否有0
        boolean col_has_zeros = false; //第一列是否有0
        
        //先检查第一行和第一列是否有0,保存在O(1)的空间中
        for(int j = 0; j < n; j++){
            
            if(matrix[0][j] == 0){
                row_has_zeros = true;
            }
            
        }  
        
        for(int i = 0; i < m; i++){
            
            if(matrix[i][0] == 0){
                col_has_zeros = true;
            }
            
        }  
        
        //利用第一行和第一列的空间存储其他位置是否出现0
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        //将其他相应位置置为0
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //如果第一行或者第一列出现0,则将整行或者整列置为0
        if(row_has_zeros == true){
        
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
        
        if(col_has_zeros == true){
            
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        

        // ------------------------------ 算法的空间复杂度O(m+n) ---------------------------------------
        // int m = matrix.length;
        // int n = matrix[0].length;
        
        // int[] row = new int[m];
        // int[] col = new int[n];
        
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = 1;
        //             col[j] = 1;
        //         }
        //     }
        // }
        
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(row[i] == 1 || col[j] == 1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        
    }
}