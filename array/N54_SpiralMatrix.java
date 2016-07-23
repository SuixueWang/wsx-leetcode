public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> results = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null) {
            return results;
        }
        
        int x1 = 0, y1 = 0;
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        while(rows >= 1 && columns >= 1){
            int x2 = x1 + rows - 1;
            int y2 = y1 + columns - 1;
            
            //遍历第一行
            for(int i = y1; i <= y2; i++){
                results.add(matrix[x1][i]);
            }
            
          //遍历最右列
            for(int i = x1+1; i < x2; i++){
                results.add(matrix[i][y2]);
            }
            
          //遍历第后一行
            if(rows > 1){
                for(int i = y2; i >= y1; i--){
                    results.add(matrix[x2][i]);
                }
            }
            
            if(columns > 1) {
              //遍历第一行
                for(int i = x2-1; i > x1; i--){
                    results.add(matrix[i][y1]);
                }
            }
            
            x1++;
            y1++;
            
            rows -= 2;
            columns -= 2;
        }
        
        
        return results;

        
    }
}