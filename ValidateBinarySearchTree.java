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

// Main idea is to define range of values for left and right subtrees.
// for left subtree, max will be root and min will be long.minvalue at first.
// for right subtree, min will be root and max will be long.maxvalue at first.

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);    // Used Long because a test case can exceed value of int
    }
    public boolean isValidBST(TreeNode root, long min, long max) {
        if(root == null)
            return true;
        
        if(root.val <= min || root.val >= max)
            return false;
        
        boolean left = isValidBST(root.left, min, root.val);
        boolean right = isValidBST(root.right, root.val, max);
        
        if(left && right)
            return true;
        return false;
    }
}