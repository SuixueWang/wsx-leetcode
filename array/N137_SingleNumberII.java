
public class Solution {
    public int singleNumber(int[] nums) {
        
        
        // 这里我们需要重新思考，计算机是怎么存储数字的。考虑全部用二进制表示，如果我们把 第 ith  个位置上所有数字的和对3取余，
        // 那么只会有两个结果 0 或 1 (根据题意，3个0或3个1相加余数都为0).  因此取余的结果就是那个 “Single Number”.
        
        int ans = 0;
        
        for(int i = 0; i < 32; i++){
            
            int sum = 0;
            
            for(int j = 0; j < nums.length; j++){
                
                if( ((nums[j] >> i) & 1) == 1){
                    sum++;
                }
                
            }
            
            ans |= (sum%3) << i;
            
        }
        
        return ans;

    }
}