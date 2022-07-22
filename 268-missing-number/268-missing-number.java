class Solution {
    public int missingNumber(int[] nums) {
        int x = 0, y = nums[0];
        for(int i=1;i<=nums.length;i++)
            x^=i;
        for(int i=1;i<nums.length;i++)
            y^=nums[i];
        return x^y;
    }
}