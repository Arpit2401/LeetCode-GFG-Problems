class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i), i);
        List<Integer> ans = new ArrayList<>();
        int prev = -1;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            max = Math.max(max, map.get(s.charAt(i)));
            if(max==i)
            {
                ans.add(max-prev);
                prev = max;
            }
        }
        return ans;
    }
}