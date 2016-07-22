public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> Num = new HashSet<Integer>();
        for(int i = 0; i<nums.length; i++){
            if(!Num.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}