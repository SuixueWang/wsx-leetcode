public class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }else if(x>=0 && x<10){
            return true;
        }
        
        long result = 0;
        int x1 = x;
        while(x > 0){
            
            result = result*10 + x%10;
            x = x / 10;
        }
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return false;
        }
        
        result = (int)result;
        
        if(x1 == result){
            return true;
        }
        
        return false;
    }
}