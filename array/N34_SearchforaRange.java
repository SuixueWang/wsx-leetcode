public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int [] range = {-1,-1};
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            
            int mid = (start + end)/2;
            if(target == nums[mid]){
                
                int i = mid;
                
                while(i>=0 && target == nums[i]){
                    i--;
                }
                range[0] = i + 1;   
                
                
                i = mid;
                

                while(i <= nums.length-1 && target == nums[i]){
                    i++;
                }
                range[1] = i - 1;
                
                return range;
                
            }
            
            if(target > nums[mid])
                start = mid + 1;
            else
                end = mid -1;
        }
        
        return range;
    }
}