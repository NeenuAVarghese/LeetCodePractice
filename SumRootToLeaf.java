/*
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        
        return sumUtil(root, 0);
    }
    
    public int sumUtil(TreeNode root, int val){
        
        if(root == null){
            return 0;
        }
        
        val = val*10 + root.val;
        if(root.left == null && root.right == null){
            return val;
        }
        
        return (sumUtil(root.left, val) + sumUtil(root.right, val)) ;
    }
}