class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1, mid=high;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if((mid-1>=0)&&(nums[mid-1]<target&&nums[mid]>target))
                    return mid;
            else if(mid==0&&target<nums[mid])
                    return mid;
            else if(mid==nums.length-1&&target>nums[mid])
                    return mid+1;
            else if(target>nums[mid])
                    low=mid+1;
            else
                    high=mid-1;
        }
        return -1;
    }
}