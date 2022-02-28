class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length-1; i++){
            int take = nums[i] + (i > 1 ? dp[i-2] : 0);
            int notTake = dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        int[] dp1 = new int[nums.length+1];
        dp1[0] = 0;
        for(int i = 1; i < nums.length; i++){
            int take = nums[i] + (i > 2 ? dp1[i-2] : 0);
            int notTake = dp1[i-1];
            dp1[i] = Math.max(take, notTake);
        }
        return Math.max(dp[nums.length-2], dp1[nums.length-1]);  
    }
}