class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2)
            return false;
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        while(i<l1)
        {
            if(arr1[i]!=arr2[i])
                return false;
            i++;
        }
        return true;
    }
}