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
    public int sumNumbers(TreeNode root) {
        int[] ans = new int[1];
        int sum = 0;
        helper(root, ans, sum);
        return ans[0];
    }
    private void helper(TreeNode root, int[] ans, int sum){
        if(root==null) return;
        sum = sum*10 + root.val;
        helper(root.left, ans, sum);
        if(root.left == null && root.right == null){
            ans[0] += sum;
            sum = 0;
        }
        helper(root.right, ans, sum);

    }
}