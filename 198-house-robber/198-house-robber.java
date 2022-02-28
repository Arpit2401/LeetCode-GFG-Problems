class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int ar[] = new int[nums.length];
        ar[0]=nums[0];
        ar[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            if(i-3<0)
                ar[i]=nums[i]+ar[i-2];
            else
                ar[i]=nums[i]+(int)Math.max(ar[i-2],ar[i-3]);
        }
        return (int)Math.max(ar[nums.length-2],ar[nums.length-1]);
    }
}