class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n==r*c)
        {
            int ans[][] = new int[r][c];
            int k=0,l=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(l==c)
                    {
                        l=0;
                        k++;
                    }
                    ans[k][l++]=mat[i][j];
                }
            }
            return ans;
        }
        return mat;
    }
}