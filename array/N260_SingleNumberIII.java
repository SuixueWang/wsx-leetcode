public class Solution {
    public int[] singleNumber(int[] nums) {
        
        int diff = 0;
        
        //所有数字异或之后得到的结果为两个只出现一次的数的异或
        for(int i = 0; i < nums.length; i++){
            diff = diff ^ nums[i];
        }
        
        //确定不同的数字,第一出现差异的位置
        diff = diff & -diff;
        
        
        int[] ans = new int[2];
        //以只出现一次的数字为主要区分点,将所有数字分为两组
        for(int i = 0; i < nums.length; i++){
            if((diff & nums[i]) == 0){
                ans[0] = ans[0] ^ nums[i];
            }else{
                ans[1] = ans[1] ^ nums[i];
            }
        }
        
        return ans;
        
        
        
        // int [] results = new int[2];
        // if(nums.length == 0) return results;
        
        // HashSet<Integer> set = new HashSet<>();
        
        // for(int i = 0; i < nums.length; i++){
        //     if(set.contains(nums[i])){
        //         set.remove(nums[i]);
        //     }else{
        //         set.add(nums[i]);
        //     }
        // }
        
        // Iterator itr = set.iterator();
        
        // results[0] = (int)itr.next();
        // results[1] = (int)itr.next();
        
        // return results;
    }
}