class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<>(); 
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for (int i = 0; i < s.length(); i++)
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }
}