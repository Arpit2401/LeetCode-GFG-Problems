// Source : https://leetcode.com/problems/defanging-an-ip-address/
// Author : Arpit Agarwal
// Date   : 20/01/2022

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/

import java.util.StringTokenizer;
class Solution {
    public String defangIPaddr(String address) {
        address+=".";
        StringTokenizer st = new StringTokenizer(address,".");
        String s = "";
        for(int i=0;i<=st.countTokens();i++)
        {
            s+=st.nextToken();
            s+="[.]";
        }
        s+=st.nextToken();
        return s;
    }
}
