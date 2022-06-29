class Solution {
    public String addBinary(String a, String b) {
        String answer = "";
        int a_l =a.length(), b_l=b.length();
        if(a_l<b_l)
            for(int i=0;i<b_l-a_l;i++)
                a='0'+a;
        if(b_l<a_l)
            for(int i=0;i<a_l-b_l;i++)
                b='0'+b;
        int carry = 0;
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(i)=='0'&&b.charAt(i)=='0')
            {
                if(carry==1)
                {
                    answer='1'+answer;
                    carry = 0;
                }
                else
                    answer='0'+answer;
            }
            else if(a.charAt(i)=='0'&&b.charAt(i)=='1'||a.charAt(i)=='1'&&b.charAt(i)=='0')
            {
                if(carry==1)
                {
                    answer='0'+answer;
                    carry = 1;
                }
                else
                    answer='1'+answer;
            }
            else
            {
                if(carry==1)
                {
                    answer='1'+answer;
                    carry = 1;
                }
                else
                {
                    answer='0'+answer;
                    carry=1;
                }
            }
        }
        if(carry==1)
            answer='1'+answer;
        return answer;
    }
}