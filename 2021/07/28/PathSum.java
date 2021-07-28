/**
 * https://leetcode.com/problems/path-sum/
 * @author Andrew Jarombek
 * @since 7/28/2021
 */

import java.util.HashSet;

class PathSum {

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
    
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        HashSet<TreeNode> treeNodes = new HashSet<>();
        treeNodes.add(root);

        while (!treeNodes.isEmpty()) {
            HashSet<TreeNode> newTreeNodes = new HashSet<>();

            for (TreeNode node: treeNodes) {
                if (node.val == targetSum && node.left == null && node.right == null) {
                    return true;
                }

                if (node.left != null) {
                    node.left.val = node.left.val + node.val;
                    newTreeNodes.add(node.left);
                }

                if (node.right != null) {
                    node.right.val = node.right.val + node.val;
                    newTreeNodes.add(node.right);
                }
            }

            treeNodes = newTreeNodes;
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assert !PathSum.hasPathSum(node, 5);
        assert PathSum.hasPathSum(node, 3);
    }
}