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
    int MAX;
    
    public int maxPathSum(TreeNode root) {
        MAX = root.val;
        find(root);
        return MAX; 
    }
    int find(TreeNode root) {
        if(root == null)
            return 0;
        
        int leftMax = find(root.left);
        int rightMax = find(root.right);
        
        leftMax = Math.max(0, leftMax);
        rightMax = Math.max(0, rightMax);
        
        // if(left + right + root.val > MAX)
        //     MAX = left + right + root.val;
        
        MAX = Math.max(MAX, root.val + leftMax + rightMax);
        
        return root.val + Math.max(leftMax, rightMax);
    }
}