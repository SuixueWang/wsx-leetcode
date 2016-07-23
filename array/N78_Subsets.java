// ------------------------------------------------- 解法一: 迭代 -------------------------------------------------------------
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<Integer>());
        
        Arrays.sort(nums);
        
        int begin = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(i == 0 || nums[i] != nums[i-1]){
                begin = 0;
            }
            
            int size = result.size();
            for(int j = begin; j < size; j++){
                
                List<Integer> cur = new ArrayList<Integer>(result.get(j));
                cur.add(nums[i]);
                result.add(cur);
            }
            
            begin = size;
        }
        
        return result;
       
    }
    
}



// ------------------------------------------------- 解法二: 深度优先搜索 -------------------------------------------------------------

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
      
        
        if(nums == null || nums.length == 0) {
            results.add(new ArrayList<Integer>(current));   
            return results;
        } 

        recursion(results, current, 0, nums, nums.length - 1);
        
        return results;             
    }

    /*
     *   使用递归方法,停止条件是: 所有元素都在最大的子集里.
     */
    public static void recursion(List<List<Integer>> results, List<Integer> current, int level, int [] nums, int len){
        
        results.add(new ArrayList<Integer>(current));  
        
        if(len < 0){
            return ;
        }
        
        for(int i = level; i < nums.length; i++) {
                
            current.add(nums[i]);
            
            recursion(results, current, i + 1, nums, len - 1); 
            
            current.remove(current.size() - 1);
                
        }
            
    }    

}