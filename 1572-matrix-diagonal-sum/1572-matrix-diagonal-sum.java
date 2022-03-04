class Solution {
    public int diagonalSum(int[][] mat) {
        int a=-1,b=mat[0].length,sum=0;
        for(int i=0;i<mat.length;i++)
        {
            a++;
            b--;
            if(a!=b)
                sum+=mat[a][a]+mat[a][b];
            else
                sum+=mat[a][a];
        }
        return sum;
    }
}