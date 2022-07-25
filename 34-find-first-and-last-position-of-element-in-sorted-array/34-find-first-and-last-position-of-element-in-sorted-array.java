class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind1=-1,ind2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ind1=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                ind2=i;
                break;
            }
        }
        int ans[]= {ind1,ind2};
        return ans;
    }
}