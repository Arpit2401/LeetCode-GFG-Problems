class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curSum = nums[0], curMax= nums[0], curMinSum=nums[0], curMin = nums[0], sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curSum = Math.max(nums[i], nums[i]+curSum);
            curMax = Math.max(curMax, curSum);
            curMinSum = Math.min(nums[i], nums[i]+curMinSum);
            curMin = Math.min(curMinSum, curMin);
            sum+=nums[i];
        }
        return sum == curMin ? curMax : Math.max(curMax, sum-curMin);
    }
}