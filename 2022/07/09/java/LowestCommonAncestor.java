/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * @author Andrew Jarombek
 * @since 7/9/2022
 */

public class LowestCommonAncestor {
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
    
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        if (root.val > Math.max(q.val, p.val)) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < Math.min(q.val, p.val)) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assert lowestCommonAncestor(root, root.left, root.right) == root;
    }
}
