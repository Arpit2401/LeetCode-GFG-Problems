class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int d = target - nums[i];
            if (map.keySet().contains(d))
                return new int[]{map.get(d), i};
            else
                map.put(nums[i], i);
        }
        return null;
    }
}