// Source : https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
// Author : Arpit Agarwal
// Date   : 21/01/2022

/*
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.

Example 1:
Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32

Example 2:
Input: n = "82734"
Output: 8

Example 3:
Input: n = "27346209830709182346"
Output: 9
*/

class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++)
        {
            int k =Character.getNumericValue(n.charAt(i));
            if(k>max)
                max=k;
        }
        return max;
    }
}
