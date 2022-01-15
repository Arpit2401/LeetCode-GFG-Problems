
  
// Source : https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author : Arpit Agarwal
// Date   : 15/01/2022

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]
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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        Stack<TreeNode> st = new Stack<>();
        while(true)
        {
            if(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            else
            {
                if(st.empty())
                    break;
                root = st.pop();
                list.add(root.val);
                root=root.right;
            }
        }
        return list;
    }
}
