public class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2){
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int mostWater = 0;
        
        while(left < right){
            
            int temp_water = (right-left) * Math.min(height[left],height[right]);
            if(temp_water > mostWater){
                mostWater = temp_water;
            }
            
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        
        return mostWater;
    }
}