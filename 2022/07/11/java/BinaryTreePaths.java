/**
 * https://leetcode.com/problems/binary-tree-paths
 * @author Andrew Jarombek
 * @since 7/11/2022
 */

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
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
 
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, result, "");
        return result;
    }

    public static void dfs(TreeNode node, List<String> list, String s) {
        if (s.length() != 0) {
            s += "->";
        }

        s += node.val;

        if (node.left == null && node.right == null) {
            list.add(s);
            return;
        }

        if (node.left != null) {
            dfs(node.left, list, s);
        }

        if (node.right != null) {
            dfs(node.right, list, s);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        var result = binaryTreePaths(node);

        assert result.size() == 2;
        assert result.get(0).equals("2->1");
        assert result.get(1).equals("2->3");
    }
}
