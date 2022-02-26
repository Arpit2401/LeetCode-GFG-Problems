class Solution {
    public int countOdds(int low, int high) {
        if(high==low)
            return low%2==0?0:1;
        if(low%2==0&&high%2==0)
            return (high-low)/2;
        if(low%2!=0&&high%2!=0)
            return 2+(high-low-1)/2;
        return 1+(high-low)/2;
    }
}