public class Solution {
    public boolean exist(char[][] board, String word) {
                
        if(board == null || word == null || board.length == 0 || board[0].length == 0 || word.length() == 0){
            return false;
        }
        
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if( dfs(board, word, i, j, 0)  ){
                    return true;
                }
            }
                
        }
                       
        return false;        
    }
    
    //深度优先搜索
    public static boolean dfs(char[][] board, String word, int i, int j, int index) {
        // TODO Auto-generated method stub
        int k = word.length();
        
        //搜索到最后一个词,则返回真
        if(index >= k) {
            return true;
        }
        
        int m = board.length - 1;
        int n = board[0].length - 1;
        
        //越界
        if(i<0 || i>m || j<0 || j>n){
            return false;
        }
        
        //这条路径不匹配
        if(word.charAt(index) != board[i][j]){
            return false;
        }
        
        //把访问过的地方设置路障
        board[i][j] = '$';
        
        // move up
        if( dfs(board, word, i-1, j, index+1) ){
            return true;
        }
        
        // move down
        if( dfs(board, word, i+1, j, index+1) ){
            return true;
        }
        
        // move left
        if( dfs(board, word, i, j-1, index+1) ){
            return true;
        }
        
        // move right
        if( dfs(board, word, i, j+1, index+1) ){
            return true;
        }
        
        //清除路障
        board[i][j] = word.charAt(index);
                       
        return false;
    }

    
}