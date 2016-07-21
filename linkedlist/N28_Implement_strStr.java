public class Solution {
    public int strStr(String haystack, String needle) {
        
        //模式串匹配问题
        //参考邹博的slide
        
        
        if(needle.length() == 0){
            return 0;
        }
        
        if(haystack.length() == 0){
            return -1;
        }
        
        char[] c_hay = haystack.toCharArray();
        char[] c_nee = needle.toCharArray();
        
        //开辟next数组空间
        int len = c_nee.length;
        int[] next = new int[len];
        
        //初始条件
        next[0] = -1;
        int j = 0;
        int k = -1;
        
        while(j < len - 1) {
            if(k == -1 || c_nee[j] == c_nee[k]){
                ++j;
                ++k;
                next[j] = k;  //next[j+1] = next[j] + 1
            }else{
                k = next[k];
            }
        }
        
        int ans = -1;
        int i = 0;
        j = 0;
        
        while(i < c_hay.length){
            if(j == -1 || c_hay[i] == c_nee[j]){
                ++i;
                ++j;
            }else{
                j = next[j];
            }
            
            if(j == len){
                ans = i - len;
                break;
            }
        }
        
        return ans;
        
    }
}