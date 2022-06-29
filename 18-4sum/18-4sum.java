class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++)
        {
            if(i!=0&&nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j!=i+1&&nums[j]==nums[j-1])
                    continue;
                int s = j+1, e=nums.length-1;
                while(s<e)
                {
                    long sum = (long)nums[i]+nums[j]+nums[s]+nums[e];
                    if(sum<target)
                        s++;
                    else if(sum>target)
                        e--;
                    else
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[s++]);
                        list.add(nums[e--]);
                        answer.add(list);
                        while(s<e&&nums[s]==list.get(2))
                            s++;
                        while(s<e&&nums[e]==list.get(3))
                            e--;
                    }
                }
            }
        }
        return answer;
    }
}