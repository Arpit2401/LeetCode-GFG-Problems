class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1],b[1]));
        int ans = 0;
        for(int i=boxTypes.length-1;i>=0;i--)
        {
            if(truckSize == 0)
                return ans;
            if(boxTypes[i][0] <= truckSize)
            {
                ans += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else
            {
                ans += truckSize*boxTypes[i][1];
                truckSize = 0;
            }
        }
        return ans;
    }
}