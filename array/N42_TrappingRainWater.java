public class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n <= 2) return 0;
        
        int max = height[0];
        int maxId = 0;
        for(int i = 1; i < height.length; i++){
            
            if(height[i] > max){
                max = height[i];
                maxId = i;
            }
        }
        
        int area = 0, maximal = height[0];
        for(int i = 1; i < maxId; i++){
            if(height[i] > maximal){
                maximal = height[i];
            }else{
                area += (maximal - height[i]);
            }
        }
        
        maximal = height[n-1];
        for(int i = n - 2; i > maxId; i--){
            if(height[i] > maximal){
                maximal = height[i];
            }else{
                area += (maximal - height[i]);
            }
        }
        
        return area;
        
    }
}