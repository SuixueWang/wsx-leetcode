public class Solution {
    public int candy(int[] ratings) {
        
        // 【思路】

        // 先从左到右扫描一遍，使得右边比左边得分高的小朋友糖果数比左边多。
        
        // 再从右到左扫描一遍，使得左边比右边得分高的小朋友糖果数比右边多。
        
        
        if(ratings.length == 0) return 0;
        
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }else{
                candies[i] = 1;
            }    
        }
        
        // int ans = candies[ratings.length - 1];
        int ans = candies[ratings.length - 1];
        for(int i = ratings.length - 2; i >= 0; i--){
            
            int cur = 1;
            
            
            if(ratings[i] > ratings[i + 1]){
                cur = candies[i + 1] + 1;
            }
            
            ans += Math.max(cur, candies[i]);
            candies[i] = cur;
        }
        
        return ans;
        
    }
}