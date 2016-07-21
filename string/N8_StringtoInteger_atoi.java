public class Solution {
    public int myAtoi(String str) {
        
        if(str.length() == 0 || str == "") return 0;
        
        //去除空格
        str = str.trim();
        
        //判断正负号,并且记录已判断字符的长度
        char flag = '+';
        int i = 0;
        if(str.charAt(0) == '-'){
            flag = '-';
            i++;
        }else if(str.charAt(0) == '+'){
            i++;
        }
        
        //用double型来保存数值
        double ans = 0;
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            ans = ans * 10 + (str.charAt(i) - '0');
            i++;
        }
        
        if(flag == '-'){
            ans = -ans;
        }
        
        //判断越界
        if(ans > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(ans < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        return (int)ans;
        
    }
}