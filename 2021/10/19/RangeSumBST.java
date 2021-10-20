/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * @author Andrew Jarombek
 * @since 10/19/2021
 */

public class RangeSumBST {
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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }

        if (root.val >= low && root.left != null) {
            sum += rangeSumBST(root.left, low, high);
        }

        if (root.val <= high && root.right != null) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}
