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
    public TreeNode invertTree(TreeNode root) {
        if (root==null){return root;}
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i=0; i<level; i++){
                TreeNode current = q.poll();
                TreeNode temp = current.left;
                if(current.left!=null){
                    q.offer(current.left);
                }
                current.left = current.right;
                
                if(current.right!=null){
                    q.offer(current.right);
                }
                current.right = temp;
            }
        }
        return root;
    }
}