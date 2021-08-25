// Source : https://leetcode.com/problems/palindrome-number/
// Author : Arpit Agarwal
// Date   : 25/08/2021

/*

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Example 1:
Input: x = 121
Output: true
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:
Input: x = -101
Output: false

*/

class Solution {
    public boolean isPalindrome(int x) {
        String st=Integer.toString(x);
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)!=st.charAt(st.length()-i-1))
            return false;
        }
        return true;
    }
}
