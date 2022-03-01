class Solution {
    public int minimumSum(int num) {
        int d[]=new int[4];
        int n=0;
        while(num > 0) 
        {
            d[n++] = num % 10;
            num /= 10;
        }

        
        for(int i=1;i<4;i++){
            if(d[0]>d[i]){
                n=d[0];
                d[0]=d[i];
                d[i]=n;
            }
        }
        for(int i=2;i<4;i++){
            if(d[1]>d[i]){
                n=d[1];
                d[1]=d[i];
                d[i]=n;
            }
        }
        
        return d[0]*10+d[1]*10+d[2]+d[3];
    }
}