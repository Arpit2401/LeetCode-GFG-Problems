/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        preOrder(root);
        return ans;
    }
    
    public void preOrder(Node root)
    {
        if(root==null)
            return;
        ans.add(root.val);
        for(Node n : root.children)
            preOrder(n);
    }
}