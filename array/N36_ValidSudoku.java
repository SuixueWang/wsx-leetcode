public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        if(board.length != 9 || board[0].length != 9 || board.length != board[0].length){
            return false;
        }
        
        //不使用HashSet,效率会高很多
        int size = 9;
        
        //逐行
        for(int i = 0; i < size; i++){
            
            boolean[] b1 = new boolean[size];
            for(int j = 0; j < size; j++){
                
                if(board[i][j] == '.') continue;
                
                int diff = board[i][j] - '1';
                if(b1[diff]){
                    return false;
                }
                
                b1[diff] = true;
            }
        }
        
        //逐列
        for(int j = 0; j < size; j++){
            
            boolean[] b2 = new boolean[size];
            for(int i = 0; i < size; i++){
                
                if(board[i][j] == '.') continue;
                
                int diff = board[i][j] - '1';
                if(b2[diff]){
                    return false;
                }
                
                b2[diff] = true;
            }
        }
        
        
        //小方块
        for(int i = 0; i < size/3; i++){
            for(int j = 0; j < size/3; j++){
                
                boolean[] b3 = new boolean[size];
                for(int k = i*3; k < (i+1)*3; k++){
                    for(int l = j*3; l < (j+1)*3; l++){
                    
                        if(board[k][l] == '.') continue;
                
                        int diff = board[k][l] - '1';
                        if(b3[diff]){
                            return false;
                        }
                        
                        b3[diff] = true;
                    
                    }
                }
                
            }
        }
        
        return true;
    }
}