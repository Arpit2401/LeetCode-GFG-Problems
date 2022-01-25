
  
// Source : https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author : Arpit Agarwal
// Date   : 25/01/2022

/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<Integer>();
        if(root == null)
            return postOrder;
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        st1.push(root);
        while(!st1.isEmpty())
        {
            TreeNode temp = st1.pop();
            if(temp != null)
            {
                st2.push(temp);
            }
            if(temp.left != null)   st1.push(temp.left);
            if(temp.right != null)  st1.push(temp.right);
        }
        while(!st2.isEmpty())
            postOrder.add(st2.pop().val);
        return postOrder;
    }
}
