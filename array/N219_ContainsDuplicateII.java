import java.util.Hashtable;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if(nums.length == 0) return false;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            
            boolean contain = map.containsKey(nums[i]);
            if(contain && i - map.get(nums[i]) <= k){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        
        return false;
        
    }
}