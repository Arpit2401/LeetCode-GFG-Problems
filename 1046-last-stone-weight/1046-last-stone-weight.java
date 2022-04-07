class Solution {
    public int lastStoneWeight(int[] stones) {
        int i = stones.length-1;
        while(i!=0)
        {
            Arrays.sort(stones);
            if(stones[stones.length-1]==stones[stones.length-2])
            {
                stones[stones.length-1]=0;
                stones[stones.length-2]=0;
            }
            if(stones[stones.length-1]!=stones[stones.length-2])
            {
                stones[stones.length-1]=stones[stones.length-1] - stones[stones.length-2];
                stones[stones.length-2]=0;
            }     
            i--;
        }           
        return stones[stones.length-1];
    }
}