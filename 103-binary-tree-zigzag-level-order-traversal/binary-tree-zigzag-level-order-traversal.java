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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        int lv = 1;
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int levelElement = q.size();
            List<Integer> level = new LinkedList<>();
            lv++;
            for(int i=0; i<levelElement; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){q.offer(curr.left);}
                if(curr.right != null){q.offer(curr.right);}
                if (lv % 2 == 0)level.add(curr.val);   // add a level denoter check odd or even
                else level.addFirst(curr.val);
            }
            ans.add(level);
            
        }
        return ans;
    }
}