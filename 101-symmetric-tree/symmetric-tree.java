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
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean ans = true;
        while(!q.isEmpty()){
            int level = q.size(); //level span
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<level; i++){
                TreeNode current = q.poll();
                
                if(current.left != null){
                        q.offer(current.left);
                        arr.add(current.left.val);
                    }else{
                        arr.add(101);
                    }
                if(current.right != null){
                    q.offer(current.right);
                    arr.add(current.right.val);
                    }else{
                        arr.add(101);
                    }
            }
            ArrayList<Integer> reverse = new ArrayList<>(arr);
            Collections.reverse(reverse);
            for(int i=0; i<arr.size(); i++){
                System.out.println(arr.get(i));
                if(arr.get(i) != reverse.get(i)){
                    ans = false;
                }
            }

        }
        return ans;
    }
}