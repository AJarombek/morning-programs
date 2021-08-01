/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * @author Andrew Jarombek
 * @since 8/1/2021
 */

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
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

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private static void preorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            preorderTraversal(root.left, result);
            preorderTraversal(root.right, result);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        List<Integer> result = preorderTraversal(node);

        assert result.size() == 3;
        assert result.get(0) == 2;
        assert result.get(0) == 1;
        assert result.get(0) == 3;
    }
}
