import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s," ");
        String ans = "";
        while(st.hasMoreTokens())
        {
            StringBuilder sb = new StringBuilder(st.nextToken());
            sb.reverse();
            ans+=sb.toString()+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}