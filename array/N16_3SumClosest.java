public class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        
        int ans = 0, minDist = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length-2; i++){
            
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int left = i + 1, right = nums.length-1;
            
            while(left < right){
                
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum < target){
                    
                    if(target - sum < minDist){
                        ans = sum;
                        minDist = target - sum;
                    }
                    
                    left++;
                    
                }else if(sum > target){
                    
                    if(sum - target < minDist){
                        ans = sum;
                        minDist = sum - target;
                    }
                    
                    right--;
                    
                }else{
                    return sum;
                }
            }
        }
        
        return ans;
  
    }
}