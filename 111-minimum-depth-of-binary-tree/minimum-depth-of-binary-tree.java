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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int count = 0;
        if(root==null){return 0;}
        q.offer(root);
        count++;
        // System.out.println(q.peek().left.val);
        while(!q.isEmpty()){
            int level = q.size();
            
            for(int i=0; i<level; i++){
                TreeNode current = q.poll();
                if(current.left == null && current.right == null){ //check is leaf or not
                    
                    return count;
                    // break;
                }else{
                    if(current.left != null){q.offer(current.left);}
                    if(current.right != null){q.offer(current.right);}
                }

            }
            count++;
        }
        return 0;
    }
}