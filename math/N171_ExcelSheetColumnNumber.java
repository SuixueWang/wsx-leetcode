public class Solution {
    public int titleToNumber(String s) {
        
        String sUpper = s.toUpperCase();
        char [] ss = s.toCharArray();
        
        int results = 0;
        int f = 1;
        
        for(int i = ss.length-1; i >=0; i--){
            
            results += charToNum(ss[i]) * f;
            
            f *= 26;
        }
        
        return results;
    }
    
    public int charToNum(char c){
        return (c - 'A' + 1);
    }
}