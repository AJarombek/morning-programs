/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 * @author Andrew Jarombek
 * @since 9/14/2021
 */

public class SubTree {
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
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root.val == subRoot.val) {
            boolean matches = this.checkMatching(root, subRoot);

            if (matches) {
                return matches;
            }
        }

        boolean matchFound = false;

        if (root.left != null) {
            matchFound = this.isSubtree(root.left, subRoot);
        }

        if (root.right != null) {
            matchFound = matchFound || this.isSubtree(root.right, subRoot);
        }

        return matchFound;
    }

    private boolean checkMatching(TreeNode root, TreeNode subRoot) {
        boolean leftMatches = true;
        boolean rightMatches = true;

        if (root.left != null) {
            if (subRoot.left != null) {
                leftMatches = this.checkMatching(root.left, subRoot.left);
            } else {
                leftMatches = false;
            }
        } else {
            if (subRoot.left != null) {
                leftMatches = false;
            }
        }

        if (root.right != null) {
            if (subRoot.right != null) {
                rightMatches = this.checkMatching(root.right, subRoot.right);
            } else {
                rightMatches = false;
            }
        } else {
            if (subRoot.right != null) {
                rightMatches = false;
            }
        }

        return root.val == subRoot.val && leftMatches && rightMatches;
    }
}
