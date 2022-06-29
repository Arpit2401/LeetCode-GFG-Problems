class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int low,high;
        if(target>nums[nums.length-1])
        {
            low=0;
            high=pivot-1;
        }
        else
        {
            low=pivot;
            high=nums.length-1;
        }
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    
    public int findPivot(int[] array)
    {
	        if (array == null || array.length == 0)
	            return -1;
	        if (array.length == 1 || array[0] < array[array.length - 1])
	            return 0;
	        int start = 0, end = array.length - 1;
	        while (start <= end)
            {
	            int mid = (start + end) / 2;
	            if (mid < array.length-1 && array[mid] > array[mid+1])
	                return (mid + 1);
	            else if (array[start] <= array[mid])     
	                start = mid + 1;
	            else
	                end = mid-1;
	        }
	        return 0;
   }
}