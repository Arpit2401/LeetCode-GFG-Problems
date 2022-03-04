class Solution {
    public int diagonalSum(int[][] mat) {
        int a=-1,b=mat[0].length,sum=0;
        for(int i=0;i<mat.length;i++)
        {
            a++;
            b--;
            for(int j=0;j<mat[0].length;j++)
            {
                if((i==a&&j==a)||(i==a&&j==b))
                    sum+=mat[i][j];
            }
        }
        return sum;
    }
}