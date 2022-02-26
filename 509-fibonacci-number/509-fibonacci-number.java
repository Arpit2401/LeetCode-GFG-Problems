class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int a = 0, b = 1;
        int f = a+b;
        for(int i=3;i<=n;i++)
        {
            a=b;
            b=f;
            f=a+b;
        }
        return f;
    }
}