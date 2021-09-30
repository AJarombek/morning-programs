/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * @author Andrew Jarombek
 * @since 9/30/2021
 */

public class SearchBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() { }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            }

            if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }
}
