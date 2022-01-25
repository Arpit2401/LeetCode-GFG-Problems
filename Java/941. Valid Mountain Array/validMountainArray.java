// Source : https://leetcode.com/problems/valid-mountain-array/
// Author : Arpit Agarwal
// Date   : 25/01/2022

/*
Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1:
Input: arr = [2,1]
Output: false

Example 2:
Input: arr = [3,5,5]
Output: false

Example 3:
Input: arr = [0,3,2,1]
Output: true
*/

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2)
            return false;
        int i=0;
        int inc=0;
        int dec=0;
        for(int j=0;j<arr.length-1;j++)
            if(arr[j]==arr[j+1])
                return false;
        while(i<arr.length-1 && arr[i]<arr[i+1])
        {
            i++;
            inc++;
        }
        while(i<arr.length-1 && arr[i]>arr[i+1] )
        {
            i++;
            dec++;
        }
        if(i==arr.length-1 && inc>0 && dec>0)
            return true;
        return false;
    }
}
