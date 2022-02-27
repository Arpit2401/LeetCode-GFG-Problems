class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0)
            return;
        if (m==0)
        {
            while (n-1>=0)
            {
                nums1[n-1] = nums2[n-1];
                n-=1;
            }
            return;
        }
        int idx = m+n-1;
        while (m-1>=0 && n-1>=0)
        {
            idx = m+n-1;
            if (nums1[m-1]>=nums2[n-1])
            {
                nums1[idx]=nums1[m-1];
                m-=1;
            }
            else
            {
                nums1[idx]=nums2[n-1];
                n-=1;
            }
        }
        while(n-1>=0)
        {
            nums1[n-1]=nums2[n-1];
            n-=1;
        }
    }
}