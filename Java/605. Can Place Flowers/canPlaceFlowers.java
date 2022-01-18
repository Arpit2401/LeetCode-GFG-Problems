// Source : https://leetcode.com/problems/can-place-flowers/
// Author : Arpit Agarwal
// Date   : 18/01/2022

/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
*/

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==2)
        {
            if(flowerbed[0]==1||flowerbed[1]==1)
                return n>0?false:true;
            else
                return n<2?true:false;
        }
        int c=0;
        for(int i=0;i<=flowerbed.length-1;i++)
        {
            if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0))
            {
                c++;
                flowerbed[i]=1;
            }
            if(c>=n)
                return true;
            
        }
        return false;
    }
}
