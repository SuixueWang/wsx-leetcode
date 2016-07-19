public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < nums.length-3; i++){
            
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            for(int j = i + 1; j < nums.length - 2; j++){
                
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                
                int left = j + 1;
                int right = nums.length - 1;
                
                while(left < right){
                    
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if(sum < target){
                        left++;
                    }else if(sum > target){
                        right--;
                    }else{
                        
                        List<Integer> temp = new ArrayList<Integer>();
                        
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        
                        ans.add(temp);
                        
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        
                        left++;
                        right--;
                        
                    }
                    
                }
            }
        }
        
        return ans;
        
 
    }
}