/**
 * https://leetcode.com/problems/invert-binary-tree/
 * @author Andrew Jarombek
 * @since 8/13/2021
 */

// Sending all my love & support your way.  You got this.

public class InvertTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode oldLeft = root.left;
        root.left = root.right;
        root.right = oldLeft;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        TreeNode tree = invertTree(new TreeNode(2, new TreeNode(1), new TreeNode(3)));
        assert tree.val == 2;
        assert tree.left.val == 3;
        assert tree.right.val == 1;
    }
}
