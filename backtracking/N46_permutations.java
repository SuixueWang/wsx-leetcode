public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        
        if(nums.length < 1){
            return results;
        }
        
        dfs_permutation(results, nums, nums.length, 0);
        
        return results;
        
    }
    
    //深度优先搜索
    public void dfs_permutation(List<List<Integer>> results, int[] nums, int size, int n) {
        if(n == size-1){
            List<Integer> single = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                single.add(nums[i]);
            }
            
            results.add(single);
            
            return ;
        }
        
        for(int i = n; i < size; i++){
            
            //交换
            int temp;
            temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            
            dfs_permutation(results, nums, size, n+1);
            
            //交换,保持原样返回
            temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            
        }
    }
    
    
}