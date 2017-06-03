/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode nodeT = root;
        
        while(nodeT != null || !st.empty()){
            while(nodeT != null){
                st.add(nodeT);
                nodeT = nodeT.left;
            }
            nodeT = st.pop();
            list.add(nodeT.val);
            nodeT = nodeT.right;
        }
        return list;
    }
}