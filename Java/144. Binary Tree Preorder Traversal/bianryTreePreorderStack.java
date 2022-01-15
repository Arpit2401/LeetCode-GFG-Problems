// Source : https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/
// Author : Arpit Agarwal
// Date   : 15/01/2022

/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

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
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        Stack<TreeNode> st = new Stack<>();
        while(true)
        {
            if(root!=null)
            {
                list.add(root.val);
                st.push(root);
                root=root.left;
            }
            else
            {
                if(st.empty())
                    break;
                root = st.pop();
                root=root.right;
            }
        }
        return list;
    }
}
