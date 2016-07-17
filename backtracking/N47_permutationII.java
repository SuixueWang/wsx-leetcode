public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        
        if(nums.length < 1){
            return results;
        }
        
        dfs_permutation(results, nums, nums.length, 0);
        
        return results;
        
    }
    
    public void dfs_permutation(List<List<Integer>> results, int[] nums, int size, int n) {
        if(n == size -1){
            List<Integer> single = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                single.add(nums[i]);
            }
            
            results.add(single);
            
            return ;
        }
        
        for(int i = n; i < size; i++){
            
            if(isDuplicate(nums, i, n)){
                continue;
            }
            
            int temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            
            dfs_permutation(results, nums, nums.length, n+1);
            
            temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
        }
        
    }
    
    
    public boolean isDuplicate(int[] nums, int t, int n){
        while(n < t){
            if(nums[n] == nums[t]){
                return true;
            }
            
            n++;
        }
        
        return false;
    }
    
    
}