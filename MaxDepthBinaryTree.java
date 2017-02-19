/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            
            if(lDepth > rDepth){
                return 1 + lDepth;
            }
            else{
                return 1 + rDepth;
            }
        }
    }
}