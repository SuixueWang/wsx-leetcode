public class Solution {
    public int majorityElement(int[] nums) {
        
        // 每找出两个不同的element，则成对删除。最终剩下的一定就是所求的。
        int count = 0, ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count++;
                ans = nums[i];
            }else if(ans == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        
        return ans;
        
    }
}