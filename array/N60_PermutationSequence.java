public class Solution {
    public String getPermutation(int n, int k) {
        
        int factorial = 1;
        
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i+1;
            factorial *= i+1;
        }
        
        k--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            
            factorial = factorial / (n - i);
            int selected = k / factorial;
            
            ans.append(nums[selected]);
            
            for(int j = selected; j < n-1-i; j++){
                nums[j] = nums[j+1];
            }
            
            k = k % factorial;
            
        }
        
        return ans.toString();
        
        
    }
}