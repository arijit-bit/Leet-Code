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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        Double num = 0.00000;
        level.offer(root);
        while(!level.isEmpty()){
            int count = level.size();
            for(int i=0; i<count; i++){
                TreeNode curr = level.poll();
                if(curr.left != null){level.offer(curr.left);}
                if(curr.right != null){level.offer(curr.right);}
                num += curr.val;

            }
            num = num/count;
            ans.add(num);
            num=0.00000;
            
        }
        return ans;
    }
}