public class Solution {
    public int[] plusOne(int[] nums) {
        
        int flag = 0;
        int sum = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            
            if(i == nums.length - 1){
                sum = nums[i] + 1;
            }else{
                sum = nums[i] + flag;
            }
            
            nums[i] = sum % 10;
            flag = sum / 10;
        }
        
        if(flag == 1){
            int[] ans = new int[nums.length + 1];
            
            ans[0] = 1;
            // for(int i = 1; i < ans.length - 1; i++){
            //     ans[i] = ans[i+1];
            // }
            
            return ans;
        }
        
        return nums;

    }
}