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
    int ans = -1,ind=0;
    public int kthSmallest(TreeNode root, int k) {
        solve(root,k);
        return ans;
    }
    
    public void solve(TreeNode root, int k)
    {
        if(root==null)
            return;
        solve(root.left,k);
        ind++;
        if(ind==k)
        {
            ans=root.val;
            return;
        }
        solve(root.right,k);
        return;
    }
}