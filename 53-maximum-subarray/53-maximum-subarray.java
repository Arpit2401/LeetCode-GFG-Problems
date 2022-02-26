class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int runningTotal = 0;
        for(int i : nums)
        {
            runningTotal += i;
            if(runningTotal > maxSum)
                maxSum = runningTotal;
            if(runningTotal < 0)
                runningTotal = 0;
        }
        return maxSum;
    }
}