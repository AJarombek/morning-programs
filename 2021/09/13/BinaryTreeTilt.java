/**
 * https://leetcode.com/problems/binary-tree-tilt/
 * @author Andrew Jarombek
 * @since 9/13/2021
 */

public class BinaryTreeTilt {
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
    
    private static int totalTilt = 0;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        search(root);
        return totalTilt;
    }

    public int search(TreeNode root) {
        if (root != null) {
            int leftSum = search(root.left);
            int rightSum = search(root.right);
            int tilt = Math.abs(leftSum - rightSum);

            totalTilt += tilt;
            return leftSum + rightSum + root.val;
        } else {
            return 0;
        }
    }
}
