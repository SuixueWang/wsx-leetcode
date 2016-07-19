public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : nums){
            set.add(num);
        }
        
        int max = 1;
        for(int num : nums){
            int count = 1;
            
            for(int j = num + 1; set.contains(j); j++){
                count++;
                set.remove(j);
            }
            
            for(int j = num - 1; set.contains(j); j--){
                count++;
                set.remove(j);
            }
            
            max = Math.max(max,count);
        }
        
        return max;
    }
}