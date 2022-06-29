class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        for(String i : words)
        {
            int fg = 0;
            for(int j=0;j<i.length();j++)
            {
                if(allowed.indexOf(i.charAt(j))==-1)
                {
                    fg=1;
                    break;
                }
            }
            if(fg==0)
                answer++;
        }
        return answer;
    }
}