public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //---------------------------------------------------------------------
        
        //先处理特殊情况  
        if (triangle == null || triangle.size() == 0) return 0;  
        if (triangle.size() == 1) return triangle.get(0).get(0);  
          
        int n = triangle.size();  
        int[] below = new int[n];   //用于保存下一层的最优解  
        int[] cur = new int[n];     //用于保存当前层的最优解  
          
        int i, j;  
          
        //初始值为最下面一行的值  
        List<Integer> lastrow = triangle.get(n - 1);  
        for (i = 0; i < n; i++) {  
            below[i] = lastrow.get(i);  
        }  
          
        //从倒数第二行开始逐层向上计算  
        for (i = n - 2; i >= 0; i--) {  
            
            List<Integer> row = triangle.get(i);  
              
            //从底层到当前层每个位置的最优解取决于其下层临近的两个元素  
            for (j = 0; j < row.size(); j++) {  
                
                if (below[j] < below[j + 1]){
                    cur[j] = below[j] + row.get(j); 
                }else{
                    cur[j] = below[j + 1] + row.get(j);  
                }
                
            }  
              
            //层次向上移动，当前层变为下层  
            for (j = 0; j < row.size(); j++) {  
                below[j] = cur[j];  
            }  
        }  
          
        return cur[0]; 
    }
}