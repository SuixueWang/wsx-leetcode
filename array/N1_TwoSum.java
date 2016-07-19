import java.util.Hashtable;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Hashtable<Integer,Integer> ht = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            ht.put(nums[i],i);
        }
        
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(ht.containsKey(target - nums[i]) && i != ht.get(target - nums[i])){
                ans[0] = i;
                ans[1] = ht.get(target - nums[i]);
                break;
            }
        }
        
        return ans;
        
    }
}