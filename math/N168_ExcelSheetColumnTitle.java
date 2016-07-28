public class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            
            char c;
            int temp = n % 26;
            
            if(temp == 0){
                c = 'Z';
                n = n/26 - 1;
            }else{
                c = (char)(temp + 'A' - 1);
                n /= 26;
            }
            
            sb.append(c);
            
        }
        
        return sb.reverse().toString();
        
    }
}