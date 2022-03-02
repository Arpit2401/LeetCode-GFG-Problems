class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board[i][j]!='.'){
                    if(!isValid(board, i, j, board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board, int i, int j, char ch){
        board[i][j]='.';
        for(int k=0;k<9;k++){
            if(board[i][k]==ch)
                return false;
            if(board[k][j]==ch)
                return false;
            int r=3*(i/3)+k/3;
            int c=3*(j/3)+k%3;
            if(board[r][c]==ch)
                return false;
        }
        board[i][j]=ch;
        return true;
    }
}