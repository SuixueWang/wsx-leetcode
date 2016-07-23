
public class Solution {
    public int maxSubArray(int[] nums) {
        
        if (nums.length <= 0) return 0;  
        int sum = 0;  
        int maxsum = Integer.MIN_VALUE;  
        for (int i = 0; i < nums.length; i++)  
        {  
            sum += nums[i];  
            if (sum > maxsum) maxsum = sum;  
            if (sum < 0) sum = 0;   //若前面的小于0,则前面的子序列都舍弃,从下一个位置开始求和.
        }
        
        return maxsum;    
    
    
    }
}