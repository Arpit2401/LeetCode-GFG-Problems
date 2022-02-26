/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0,mid;
        n--;
        while(low<=n)
        {
            mid=low+(n-low)/2;
            if(isBadVersion(mid))
                n=mid-1;
            else
                low=mid+1;
        }
        return n+1;
    }
}