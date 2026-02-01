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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = true;
        ArrayList<Integer> listp = new ArrayList<>();
        ArrayList<Integer> listq = new ArrayList<>();
        traverse_p(p, listp);
        traverse_q(q, listq);
        if (listp.size() != listq.size()) return false;
        for(int i=0; i<listp.size(); i++){
            System.out.println(listp.get(i));
            System.out.println(listq.get(i));
            if(!listp.get(i).equals(listq.get(i))){
                flag = false;
            }
        }
        return flag;


    }
    protected void traverse_p(TreeNode n, ArrayList<Integer> listp){
        if(n==null){
            listp.add(Integer.MAX_VALUE);
            return;
        }
        listp.add(n.val);
        traverse_p(n.left, listp);
        traverse_p(n.right, listp);
    }
    protected void traverse_q(TreeNode n, ArrayList<Integer> listq){
        if(n==null){
            listq.add(Integer.MAX_VALUE);
            return;
        }
        listq.add(n.val);
        traverse_q(n.left, listq);
        traverse_q(n.right, listq);
    }
}