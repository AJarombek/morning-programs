/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * @author Andrew Jarombek
 * @since 9/10/2021
 */

public class TreeDiameter {
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
    
    private int longest = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        this.longest = 0;
        findDepth(root);
        return this.longest;
    }

    public int findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = findDepth(root.left);
            int right = findDepth(root.right);
            int diameter = left + right;

            if (diameter > this.longest) {
                this.longest = diameter;
            }

            return Math.max(left, right) + 1;
        }
    }
}

// Hope you are hanging in there, my love is always here for you.
