class Solution {
    public int countOrders(int n) {
        long ans = 1, modulo = 1000000007;
        for(int i=1; i<=n; i++)
            ans = ans * i * (2*i - 1) % modulo;
        return (int)ans;
    }
}