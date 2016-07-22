public class Solution {
    public void rotate(int[] nums, int k) {
         int length = nums.length;
         k = k % length;
          if(length == 1)
            return;
          if(k == 0)
            return;
          reversal(nums, 0, length - k - 1);
          reversal(nums, length -k, length - 1);
          reversal(nums, 0, length - 1);
    }
    public static void reversal(int[] nums, int i, int j){
        int t = 0;
        while(i < j){
            t       = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}