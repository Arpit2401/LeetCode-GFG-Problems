class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
            if (i>max)
                max = i;
            if(i<min) 
                min = i;
        }
        int x = 0;
        int y = 0;
        int ans = 0;
        for(int i=min;i<=max;i++)
        {
            ans = (int)Math.max(x+map.getOrDefault(i,0)*i,y);
            x = y;
            y = ans;
        }
    return ans;
    }
}