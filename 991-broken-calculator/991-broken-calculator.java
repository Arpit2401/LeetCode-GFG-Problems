class Solution {
    public int brokenCalc(int startValue, int target) {
        if(target<=startValue)
            return startValue-target;
        int ans = 0;
        while(target!=startValue)
        {
            ans++;
            if(target%2==0)
                target/=2;
            else
                target+=1;
            if(target<=startValue)
            {
                ans+=startValue-target;
                break;
            }
        }
        return ans;
    }
}