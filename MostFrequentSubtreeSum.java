/**
 *iven the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined 
 *as the sum of all the node values formed by the subtree rooted at that node (including the node itself). 
 *So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency 
 *in any order.
 * 
 *Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MostFrequentSubtreeSum {
    
    Map<Integer, Integer> sumCount = new HashMap<Integer, Integer>();
    int maxCount = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        int count = 0;
        
        postorder_traverse(root);
        
         for (int key : sumCount.keySet()) {
            if (sumCount.get(key) == maxCount) {
                count++;
            }
        }
        
        int[] res = new int[count];
        int i=0;
        
        for (int key : sumCount.keySet()) {
            if (sumCount.get(key) == maxCount) {
                res[i] = key;
                i++;
            }
        }
        
        return res;
        
        
    }
    
     int postorder_traverse(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int left = postorder_traverse(root.left);
        int right = postorder_traverse(root.right);
        
        int sum = left + right + root.val;
        System.out.println(sum);
        if(sumCount.containsKey(sum)){
            int count = sumCount.get(sum) + 1;
            sumCount.put(sum, count);
        }
        else{
            sumCount.put(sum, 0);
        }
        
        maxCount = Math.max(sumCount.get(sum), maxCount);
        
        return sum;
    }
}