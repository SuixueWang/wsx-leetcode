public class Solution {
    public String reverseString(String s) {
        
        if(s.length() == 0){
            return "";
        }
        
        char[] c = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = c.length-1; i >=0; i--){
            sb.append(c[i]);
        }
        
        return sb.toString();
    }
}