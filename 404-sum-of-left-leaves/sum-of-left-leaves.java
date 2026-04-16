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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null && root.right==null) return 0;
        int ans = 1;
        int sum[] = {0};
        bc(root,sum, ans);
        return sum[0];
    }
    private void bc(TreeNode root, int []sum, int ans){
        if (root==null) return;
        if(ans==1 && root.left==null && root.right==null){
            sum[0] = sum[0]+root.val;
            return ;
        }
        bc(root.left, sum, 1);
        bc(root.right, sum, 0);
    }
}