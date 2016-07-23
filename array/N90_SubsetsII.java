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
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        HashSet<List<Integer>> results_set = new HashSet<List<Integer>>();
      
        Arrays.sort(nums); //先排序
        
        if(nums == null || nums.length == 0) {
            results.add(new ArrayList<Integer>(current));   
            return results;
        } 
        
        int len = nums.length - 1;
        recursion(results_set, results, current, 0, nums, len);
        
        return results;             
    }

    /*
     *   使用递归方法,停止条件是: 所有元素都在最大的子集里.
     */
    public static void recursion(HashSet<List<Integer>> results_set, List<List<Integer>> results, List<Integer> current, int level, int [] nums, int len){
        List<Integer> cur_temp = new ArrayList<Integer>(current);
        
        if(!results_set.contains(cur_temp)){                     
            results.add(cur_temp);  
            results_set.add(cur_temp);
        }else 
        if(len <= 0) {
            return ;
        }
        
        for(int i = level; i < nums.length; i++) {
            
            current.add(nums[i]);
            
            recursion(results_set, results, current, i + 1, nums, len - 1); 
            
            current.remove(current.size() - 1);
                
        }
            
    }    
    
}