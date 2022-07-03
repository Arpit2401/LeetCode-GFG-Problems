class Solution {
    public int wiggleMaxLength(int[] nums) {
        int peak = 0, valley = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                peak = valley + 1;
            }
            else if (nums[i - 1] > nums[i]) {
                valley = peak + 1;
            }
        }
        return 1 + Math.max(peak, valley);
    }
}