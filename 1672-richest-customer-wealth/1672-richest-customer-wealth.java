class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=Integer.MIN_VALUE;
        for(int i[]:accounts)
        {
            int s=0;
            for(int j:i)
            {
                s+=j;
            }
            if(s>sum)
                sum=s;
        }
        return sum;
    }
}