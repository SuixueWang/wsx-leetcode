public class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length <= 1){
            return ;
        }
        
        //后找
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        
        if(i < 0) {
            reverse(nums,0,nums.length-1);
            return ;
        }
        
        //S[i+1...N-1]中比S[i]大的最小值S[j]
        int j = nums.length - 1;
        while(nums[i] >= nums[j]) j--;
        
        //交换
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        //翻转
        // Arrays.sort(nums,i+1,nums.length);
        reverse(nums,i+1,nums.length-1);
        
    }
    
    public void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}