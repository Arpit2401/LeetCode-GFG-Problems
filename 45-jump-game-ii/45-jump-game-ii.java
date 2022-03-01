class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        int ar[] = new int[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            if(i+nums[i]>=nums.length-1)
                ar[i]=1;
            else
            {
                if(nums[i]==0)
                    ar[i]=0;
                else
                {
                    int fg = nums[i], k=0;
                    int min = Integer.MAX_VALUE;
                    while(fg>0)
                    {
                        if(ar[i+fg]!=0)
                        {
                            if(ar[i+fg]<min)
                            {
                                min=ar[i+fg];
                                k=1;
                            }
                        }
                        fg--;
                    }
                    if(k==0)
                        ar[i]=0;
                    else
                        ar[i]=min+1;
                }
            }
        }
        return ar[0];
    }
}