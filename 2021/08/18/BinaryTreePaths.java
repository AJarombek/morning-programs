/**
 * https://leetcode.com/problems/binary-tree-paths/
 * @author Andrew Jarombek
 * @since 8/18/2021
 */

// Ran the 1500m on the Outdoor Track.  4:32, so nothing fast but it was a lot of fun.

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        traverseNode(root, String.valueOf(root.val), paths);
        return paths;
    }

    public void traverseNode(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            if (node.left != null) {
                traverseNode(node.left, path + "->" + String.valueOf(node.left.val), paths);
            }

            if (node.right != null) {
                traverseNode(node.right, path + "->" + String.valueOf(node.right.val), paths);
            }
        }
    }
}
