public class Solution {
    public int removeElement(int[] nums, int val) {

        //双指针
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j] == val){
                j++;
            }else{
                nums[i++] = nums[j++];
            }
        }
        
        return i;


        // int index = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != val){
        //         nums[index++] = nums[i];
        //     }
        // }
        
        // return index;

    }
}