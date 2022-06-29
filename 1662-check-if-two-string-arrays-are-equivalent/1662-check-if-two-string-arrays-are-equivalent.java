class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st1 = "";
        String st2 = "";
        for(String i : word1)
            st1+=i;
        for(String i : word2)
            st2+=i;
        return st1.equals(st2);
    }
}