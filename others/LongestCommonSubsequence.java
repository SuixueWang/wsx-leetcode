package others;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        int len = LCS(s1,s2);
        
        System.out.println(len);
        
        
    }
    
    public static int LCS(String s1, String s2){
        
        if(s1.length() == 0 || s2.length() == 0){
            return 0;
        }
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        int[][] numArray = new int[c1.length+1][c2.length+1];
        
        for(int i = 0; i <= c1.length; i++){
            numArray[i][0] = 0;
        }
        
        for(int j = 0; j <= c2.length; j++){
            numArray[0][j] = 0;
        }
        
        for(int i = 1; i <= c1.length; i++){
            for(int j = 1; j <= c2.length; j++){
                if(c1[i-1] == c2[j-1]){                        //对于字符串,下表从0开始
                    numArray[i][j] = numArray[i-1][j-1] + 1;
                }else{
                    numArray[i][j] = Math.max(numArray[i-1][j],numArray[i][j-1]);
                }
            }
        }
        
        return numArray[c1.length][c2.length];
    }

}
