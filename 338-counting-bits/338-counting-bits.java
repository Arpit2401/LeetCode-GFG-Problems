class Solution {
    public int[] countBits(int n) {
        int ar[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int count = 0;
            int temp=i;
            while(temp!=0)
            {
                if(temp<0)
                    count++;
                temp=temp<<1;
            }
            ar[i]=count;
        }
        return ar;
    }
}