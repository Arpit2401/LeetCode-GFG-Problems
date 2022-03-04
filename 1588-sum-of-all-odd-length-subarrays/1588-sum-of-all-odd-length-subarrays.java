class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            int curr_sum = 0, k=1;
            for(int j=i;j<arr.length;j++,k++)
            {
                curr_sum+=arr[j];
                if(k%2!=0)
                    sum+=curr_sum;
            }
        }
        return sum;
    }
}