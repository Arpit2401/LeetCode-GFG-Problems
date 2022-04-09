class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1,o2)->map.get(o1)-map.get(o2));
        for(Integer key:map.keySet())
        {
            minHeap.add(key);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        int[] op = new int[k];
        while(!minHeap.isEmpty())
            op[--k]=minHeap.poll();
        return op;
    }
}