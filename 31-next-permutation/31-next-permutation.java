class Solution {
    public static void nextPermutation(int[] nums) {
        if(nums.length<=1)
            return;
        int left = nums.length-2;
        while(left>=0 && nums[left]>=nums[left+1])
            left--;
        if(left>=0)
        {
            int right = nums.length - 1;
            while(right>=0 && nums[left]>=nums[right])
                right--;
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        int low = left+1;
        int high = nums.length - 1;
        while (low<high)
        {
            int temp = nums[low];
            nums[low++] = nums[high];
            nums[high--] = temp;
        }
    }
}