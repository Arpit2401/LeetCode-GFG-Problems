class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length(), a = 0, b = 0;
        String ans = "";
        while(a<l1&&b<l2)
        {
            ans+=word1.charAt(a++);
            ans+=word2.charAt(b++);
        }
        while(a<l1)
            ans+=word1.charAt(a++);
        while(b<l2)
            ans+=word2.charAt(b++);
        return ans;
    }
}