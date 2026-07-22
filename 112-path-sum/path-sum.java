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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        boolean[] ans = new boolean[1];
        ans[0] = false;
        helper(root, targetSum, sum, ans);
        return ans[0];
    }
    private void helper(TreeNode root, int targetSum, int sum, boolean[] ans){
        if (root==null){
            return;
        }
        sum += root.val;
        System.out.println(root.val);
        helper(root.left, targetSum, sum, ans);
        // sum+= root.val; ---tht was a misake figureout why ---
        System.out.println(root.val);
        System.out.println("sum : " + sum);
        if(root.left==null && root.right==null){

        if(sum==targetSum) ans[0] = true;
        }
        helper(root.right, targetSum, sum, ans);

    }
}