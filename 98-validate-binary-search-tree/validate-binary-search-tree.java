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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean helper(TreeNode node, long lower, long upper) {
        if (node == null) return true;
        
        if (node.val <= lower || node.val >= upper) return false;
        
        // Check left subtree with updated upper bound
        if (!helper(node.left, lower, node.val)) return false;
        
        // Check right subtree with updated lower bound
        if (!helper(node.right, node.val, upper)) return false;
        
        return true;
    }
}