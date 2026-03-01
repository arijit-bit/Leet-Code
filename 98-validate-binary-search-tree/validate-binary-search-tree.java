class Solution {
    long prev = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) return true;

        if (!inorder(root.left)) return false;

        if (root.val <= prev) return false;
        prev = root.val;

        return inorder(root.right);
    }
}