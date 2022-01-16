// Source : https://leetcode.com/problems/maximize-distance-to-closest-person/
// Author : Arpit Agarwal
// Date   : 16/01/2022

/*

You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
There is at least one empty seat, and at least one person sitting.
Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 
Return that maximum distance to the closest person.

Example 1:
Input: seats = [1,0,0,0,1,0,1]
Output: 2
Explanation: 
If Alex sits in the second open seat (i.e. seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.

Example 2:
Input: seats = [1,0,0,0]
Output: 3
Explanation: 
If Alex sits in the last seat (i.e. seats[3]), the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.

Example 3:
Input: seats = [0,1]
Output: 1

*/

class Solution {
    public int maxDistToClosest(int[] seats) {
       int preDist = -1, postDist = -1, maxDist = -1, dist = 0;
        for (int i = 0; i < seats.length; i ++) {
            if (seats[i] == 0) {
                dist++;
            } else {
                if (preDist == -1) {
                    preDist = dist;
                } else {
                    maxDist = Math.max(maxDist, dist);
                }
                dist = 0;
            }
        } 
        postDist = dist;
        return Math.max(Math.max(preDist, postDist), (maxDist + 1) / 2);
    }
}
