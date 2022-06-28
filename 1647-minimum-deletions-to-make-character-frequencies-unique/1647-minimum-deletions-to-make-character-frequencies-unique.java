class Solution {
    public int minDeletions(String s) {
        int arr[] = new int[26];
        HashSet<Integer> set = new HashSet<>();
        for(char ch : s.toCharArray())
            arr[ch - 'a'] ++;
        int deletion = 0;
        for(int val : arr)
        {
            while(val != 0 && set.contains(val))
            {
                val --;
                deletion ++;
            }
            set.add(val);
        }
        return deletion;
    }
}