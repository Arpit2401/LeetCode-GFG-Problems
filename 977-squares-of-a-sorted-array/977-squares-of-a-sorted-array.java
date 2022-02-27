class Solution {
    public int[] sortedSquares(int[] nums) {
        int mid = 0, n = nums.length;
        for(int i = 0; i < n; i++){
            mid = i;
            if(nums[i] >= 0)
                break;
        }
        int L = mid -1, R = mid;
        int[] arr = new int[n];
        int index = 0;
        while(0 <= L && R <= n - 1)
        {
            int Left = nums[L] * nums[L];
            int Right = nums[R] * nums[R];
            if(Left > Right)
            {
                arr[index] = Right;
                R++;
            }
            else
            {
                arr[index] = Left;
                L--;
            }
            index++;           
        }
        while(0 <= L)
        {
            arr[index++] = nums[L] * nums[L];
            L--;

        }
        while(R <= n - 1)
        {
            arr[index++] = nums[R] * nums[R];
            R++;
        }
        return arr;
    }
}