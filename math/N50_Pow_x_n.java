public class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0) return 1.0;
        
        if(n>0){
            return recurPow(x,n);
        }else{
            return 1/recurPow(x,n);
        }

    }
    
    public double recurPow(double x, int n){
        if(n == 0){
            return 1.0;
        }
        
        double v = recurPow(x,n/2);
        
        if(n%2 == 0){
            return v*v;
        }else{
            return v*v*x;
        }
        
    }
    
    
}