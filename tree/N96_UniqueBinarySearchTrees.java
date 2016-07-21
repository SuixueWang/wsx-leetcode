public class Solution {
    public int numTrees(int n) {
        if(n == 1) return 1;
        
        if(n == 2) return 2;
        
        int[] records = new int[n+1];
        
        records[0] = 1;
        records[1] = 1;
        records[2] = 2;
        
        for(int i = 3; i <= n; i++){
            
            int sum_temp = 0;
            
            for(int k = 0; k < i; k++){
                sum_temp += (records[k] * records[i-1-k]);
            }
            
            records[i] = sum_temp;
            
        }
        
        return records[n];
    }
}