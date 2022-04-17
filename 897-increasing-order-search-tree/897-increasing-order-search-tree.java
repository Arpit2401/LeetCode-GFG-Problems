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
    TreeNode ans = new TreeNode(-1);
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        TreeNode out = ans;
        inorder(root);
        return out.right;
    }
    
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        ans.right = new TreeNode(root.val);
        ans = ans.right;
        inorder(root.right);
    }
    
}