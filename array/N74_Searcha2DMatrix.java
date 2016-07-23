public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        
        return false;



        // ------------------- 这般查找 -------------------

        // int start = 0;
        // int end = matrix.length * matrix[0].length - 1;
        
        // while(start <= end){
        //     int mid = (start + end)/2;
        //     int m = mid / matrix[0].length;
        //     int n = mid % matrix[0].length;
            
        //     if(target == matrix[m][n]){
        //         return true;
        //     }
            
        //     if(target < matrix[m][n]){
        //         end = mid - 1;
        //     }else{
        //         start = mid + 1;
        //     }
        // }
        
        // return false;
    }
}