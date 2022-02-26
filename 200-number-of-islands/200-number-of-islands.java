class Solution {
    int count = 0;
    public int numIslands(char[][] grid) {
        int i,j;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    convert(grid,i,j);
                    i=0;
                }
            }
        }
        return count;
    }
    public void convert(char grid[][], int i, int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'||grid[i][j]=='2')
            return;
        grid[i][j]='2';
        convert(grid, i+1,j);
        convert(grid, i-1,j);
        convert(grid, i,j+1);
        convert(grid, i,j-1);
        return;
    }
}