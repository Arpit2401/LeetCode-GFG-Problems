class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int cnt = 0, n = arr.length, mod = 1000000007;
        for (int i = 0; i < n; i++){
            int a = arr[i];
            HashMap<Integer, Integer> freq = new HashMap();
            for (int j = i + 1; j < n; j++){
                int b = arr[j];
                int c = target - a - b;
                if (freq.containsKey(c)){
                    cnt += freq.get(c);
                    cnt %= mod;
                }
                freq.put(b, freq.getOrDefault(b, 0) + 1);
            }
        }
        return cnt;
    }
}