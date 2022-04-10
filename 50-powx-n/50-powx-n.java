class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        double ans = Math.pow(x,(int)Math.abs(n/2));
        ans = n%2==0?ans*ans:ans*ans*x;
        return n>0?ans:1/ans;
    }
}