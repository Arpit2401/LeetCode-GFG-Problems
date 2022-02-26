/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1,mid;
        while(l<=n)
        {
            mid=l+(n-l)/2;
            if(isBadVersion(mid))
            {
                if(mid==0)
                    return mid;
                else if(isBadVersion(mid-1)==false)
                    return mid;
                else
                    n=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
}