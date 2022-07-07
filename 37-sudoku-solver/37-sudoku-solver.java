class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(isSafe(board,i,j,c))
                        {
                            board[i][j]=c;
                            if(solve(board))
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isSafe(char[][] board, int i, int j, char c)
    {
        for(int ind=0;ind<9;ind++)
        {
            if(board[ind][j]==c)
                return false;
            if(board[i][ind]==c)
                return false;
            if(board[3*(i/3)+ind/3][3*(j/3)+ind%3]==c)
                return false;
        }
        return true;
    }
}