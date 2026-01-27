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
    public int maxDepth(TreeNode root) {
        int ans = backtrack(root);
        return ans;
    }
    protected int backtrack(TreeNode root){
        if(root==null){return 0;}
        int lh = backtrack(root.left);
        int rh = backtrack(root.right);
        return 1+Math.max(lh, rh);

    }
}