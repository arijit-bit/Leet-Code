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
    public TreeNode insertIntoBST(TreeNode root, int value) {
        TreeNode ans = root;
        if(root == null) return new TreeNode(value);
        // return bc(root, val);
        Stack <TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            //go right 
            if(curr != null && curr.val < value){
                if(curr.right != null){
                    st.push(curr.right);
                }else{
                    curr.right = new TreeNode(value);
                    return ans;
                }
            }
            if(curr !=null && curr.val > value){
                if(curr.left != null){
                    st.push(curr.left);
                }else{
                    curr.left = new TreeNode(value);
                    return ans;
                }
            }
        }
        return null;
    }
}
    // private TreeNode bc(TreeNode root, int val)