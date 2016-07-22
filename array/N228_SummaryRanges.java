public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result = new ArrayList<String>();
        if(nums==null || nums.length < 1){
            return result;
        }

        int start = 0, end = 0;
        while(end<nums.length){
            if(end+1<nums.length && nums[end+1]==nums[end]+1){
                end++;
            }else{
                if(start==end){
                    result.add(Integer.toString(nums[start]));
                }else{
                    StringBuilder str = new StringBuilder();
                    str.append(nums[start]);
                    str.append("->");
                    str.append(nums[end]);
                    // String str = nums[start] + "->" + nums[end];
                    result.add(str.toString());
                }
                start = ++end;
            }
        }
        return result;
        
    }
}