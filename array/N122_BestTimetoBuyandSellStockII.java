public class Solution {
    public int maxProfit(int[] price) {
        
        if(price.length < 2){
            return 0;
        }
        
        int maxProfit = 0;
        int curMin = price[0];
        
        for(int i = 1; i<price.length; i++){
            if(price[i] - curMin > 0){
                maxProfit += price[i] - curMin;
                curMin = price[i];
            }else{
                curMin = Math.min(curMin, price[i]);
            }
            
        }
        
        return maxProfit;
    }
}