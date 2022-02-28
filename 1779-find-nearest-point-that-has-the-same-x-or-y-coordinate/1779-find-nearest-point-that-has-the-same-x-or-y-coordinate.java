class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min_dist = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<points.length;i++)
        {
            int curr_dist=0;
            if(x==points[i][0]||y==points[i][1])
            {
                curr_dist = (int)Math.abs(points[i][0]-x)+(int)Math.abs(points[i][1]-y);
                if(curr_dist<min_dist)
                {
                    min_dist=curr_dist;
                    ans=i;
                }
            }
        }
        return ans;
    }
}