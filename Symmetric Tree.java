class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null → same
        if (p == null && q == null) return true;

        // One node is null → different
        if (p == null || q == null) return false;

        // Check current node value + left + right
        return (p.val == q.val) 
                && isSameTree(p.left, q.left) 
                && isSameTree(p.right, q.right);
    }
}
