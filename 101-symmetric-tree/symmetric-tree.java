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
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return false;
        
        return bc(root.left, root.right);
    }
    private boolean bc(TreeNode root1,TreeNode root2){
        //if both null than symmetric
        if(root1 == null && root2 == null){
            return true;
        }
        // if this hit means both are not symmetric only one is symmetric
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return bc(root1.left, root2.right) && bc(root1.right,root2.left);

    }
}