public class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        if(nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = (start + end)/2;
            if(nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            
            if(nums[mid] > nums[0]) {
                start = mid;
            }else {
                end = mid;
            }
        }
        
        return 0;        
    }
}