/**
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 * @author Andrew Jarombek
 * @since 9/20/2021
 */

public class SecondMinimumValue {
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
    
    public int findSecondMinimumValue(TreeNode root) {
        return findSecondMinimumValue(root, root.val);
    }

    public int findSecondMinimumValue(TreeNode root, int smallest) {
        if (root == null) {
            return -1;
        }

        if (root.val != smallest) {
            return root.val;
        } else {
            int leftValue = findSecondMinimumValue(root.left, smallest);
            int rightValue = findSecondMinimumValue(root.right, smallest);

            if (leftValue == -1 && rightValue == -1) {
                return -1;
            }

            if (leftValue == -1) {
                leftValue = Integer.MAX_VALUE;
            }

            if (rightValue == -1) {
                rightValue = Integer.MAX_VALUE;
            }

            return Math.min(
                    leftValue,
                    rightValue
            );
        }
    }
}
