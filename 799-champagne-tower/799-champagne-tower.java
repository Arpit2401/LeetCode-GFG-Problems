class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured==0)
            return 0;
        double tower[][] = new double[query_row+2][];
        for(int i=0;i<=query_row+1;i++)
            tower[i] = new double[i+1];
        tower[0][0] = poured;
        for(int i=0;i<=query_row;i++)
        {
            for(int j=0;j<tower[i].length;j++)
            {
                if(tower[i][j]>1)
                {
                    tower[i+1][j]+=(tower[i][j]-1)/2;
                    tower[i+1][j+1]+=(tower[i][j]-1)/2;
                    tower[i][j]=1;
                }
            }
        }
        return Math.min(1,tower[query_row][query_glass]);
    }
}