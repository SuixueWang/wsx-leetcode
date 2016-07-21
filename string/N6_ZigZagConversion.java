public class Solution {
    public String convert(String s, int numRows) {
        
        // The distribution of the elements is period.

        // P   A   H   N
        // A P L S I I G
        // Y   I   R
        
        // For example, the following has 4 periods(cycles):
        
        // P   | A   | H   | N
        // A P | L S | I I | G
        // Y   | I   | R   |
        
        // The size of every period is defined as "cycle"
        
        // cycle = (2*nRows - 2), except nRows == 1.
        
        // In this example, (2*nRows - 2) = 4.
        
        // In every period, every row has 2 elements, except the first row and the last row.
        
        // Suppose the current row is i, the index of the first element is j:
        
        // j = i + cycle*k, k = 0, 1, 2, ...
        
        // The index of the second element is secondJ:
        
        // secondJ = (j - i) + cycle - i
        
        // (j-i) is the start of current period, (j-i) + cycle is the start of next period.
        
        
        if(numRows <= 1) return s;
        
        char[] string = s.toCharArray();
        
        String ans = "";
        StringBuilder sb = new StringBuilder();  //果断用sb速度会快很多
        int cycle = 2*numRows - 2;
        
        for(int i = 0; i < numRows; i++){
            for(int j = i; j < string.length; j = j + cycle){
                
                // ans = ans + string[j];
                sb.append(string[j]);
                
                int secondJ = (j - i) + cycle - i; //可理解为 j + cycle - 2*i
                if(i != 0 && i != numRows - 1 && secondJ < string.length){
                    // ans = ans + string[secondJ];
                    sb.append(string[secondJ]);
                }
            }
        }
        
        return sb.toString();
        
    }
}