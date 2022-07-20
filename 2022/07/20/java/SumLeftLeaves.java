/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 * @author Andrew Jarombek
 * @since 7/20/2022
 */

public class SumLeftLeaves {
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
    
    private int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        this.sum = 0;
        dfs(root, false);
        return this.sum;
    }

    private void dfs(TreeNode node, boolean leftNode) {
        if (node.left == null && node.right == null) {
            if (leftNode)
                this.sum += node.val;

            return;
        }

        if (node.left != null) {
            dfs(node.left, true);
        }

        if (node.right != null) {
            dfs(node.right, false);
        }
    }

    public static void main(String[] args) {
        var program = new SumLeftLeaves();
        var node = new TreeNode(2, new TreeNode(1), new TreeNode(3, new TreeNode(4), null));
        assert program.sumOfLeftLeaves(node) == 5;
        // I'm so sorry if you wish we never met.  Why don't you just say so and let me be free?
    }
}
