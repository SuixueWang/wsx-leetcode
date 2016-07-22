public class Solution {
    public void moveZeroes(int[] nums) {
        
        if(nums.length == 0) return ;
        
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        
        while(k < nums.length){
            nums[k++] = 0;
        }
        
    }
}