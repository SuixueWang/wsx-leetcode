public class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() == 0) return "";
        
        char[] c = s.toCharArray();
    
        // 添加#, 解决奇数 偶数问题
        int len = c.length;
        char[] c_extend = new char[2*len+1];
        
        for(int i = 0; i < 2*len+1; i++) {
            if(i%2 == 0){
                c_extend[i] = '#';
            }else {
                c_extend[i] = c[i/2];
            }
        }
        
        //Manacher Code, 求出以每一个点为中心的最长回文子串的长度, 并记录max(P)
        int[] P = new int[2*len+1];
        P[0] = 1;
        int id = 0;
        int mx = 1;
        int k = 0, max = P[0];
        
        for(int i = 1; i < 2*len+1; i++){
            
            if(mx > i){
                P[i] = Math.min(P[2*id-i], mx-i);
            }else{
                P[i] = 1;
            }
            
            for(; i-P[i]>=0 && i+P[i]<=2*len && c_extend[i+P[i]] == c_extend[i-P[i]]; P[i]++);
            
            if(mx < i+P[i]){
                mx = i + P[i];
                id = i;
            }
            
            //记录最长的那个
            if(max < P[i]){
                k = i;
                max = P[i];
            }
        }
        
        
        //提取回文字符
        char[] result = new char[P[k] - 1];
        int j = 0;
        
        for(int i = -(P[k]-1); i < P[k]-1; i++){
            if(c_extend[k+i] != '#'){
                result[j++] = c_extend[k+i];
            }
        }
        return String.valueOf(result);
    }
}