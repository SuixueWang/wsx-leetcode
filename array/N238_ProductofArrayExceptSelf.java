public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length < 1)
            return nums;
        
        int product = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                product *= nums[i];
            }else{
                for(int j = 0; j<i; j++){
                    nums[j] = 0;
                }
                
                for(int j = i+1; j<nums.length; j++){
                    product *= nums[j];
                    nums[j] = 0;
                }
                
                nums[i] = product;
                
                return nums;
            }
            
        }
        
        for(int i = 0; i<nums.length; i++){
            nums[i] = product / nums[i];
        }
        
        return nums;
    }
}   