import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        // if(n <= 0){
        //     return false;
        // }
        
        // long ln = n;
        // Set<Long> set = new HashSet<Long>();
        
        // while(ln < Integer.MAX_VALUE){
        //     if(set.contains(ln)){
        //         return false;
        //     }else{
        //         set.add(ln);
        //     }
            
        //     ln = squareSum(ln);
            
        //     if(ln == 1){
        //         return true;
        //     }
        // }
        
        // return false;
        
        
        
        
        
        //----------------------------------------------------------------------------------------
        if(n <= 0){
            return false;
        }
        
        long ln = n;
        
        while(ln < Integer.MAX_VALUE){
            
            ln = squareSum(ln);
            
            if(ln == 1){
                return true;
            }else if(ln == 4 || ln == 16 ||
                     ln == 37 || ln == 58 ||
                     ln == 89 || ln == 145 ||
                     ln == 42 || ln == 20){
                         
                return false;
            }
            
        }
        
        return false;
        
        
    }
    
    public long squareSum(long ln){
        long sum = 0;
        while(ln != 0){
            sum +=  (ln%10) * (ln%10);                  //Math.pow(ln%10,2);
            
            ln /= 10;
        }
        
        return sum;
    }
}