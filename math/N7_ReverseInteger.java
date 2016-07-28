public class Solution {
    public int reverse(int x) {
        
        if(x>-10 && x<10){
            return x;
        }
        
        boolean flag = false;
        if(x < 0){
            flag = true;
        }
        
        x = Math.abs(x);
        
        long result = 0;
        while(x > 0){
            
            result = result*10 + x%10;
            x = x / 10;
        }
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        
        if(flag == true){
            return -(int)result;
        }
        
        return (int)result;
        
        

    }
}