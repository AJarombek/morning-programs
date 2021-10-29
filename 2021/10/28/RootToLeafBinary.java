/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 * @author Andrew Jarombek
 * @since 10/28/2021
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class RootToLeafBinary {
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
    
    public int sumRootToLeaf(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int result = 0;

        while (queue.size() > 0) {
            TreeNode node = queue.remove();

            if (node.left == null && node.right == null) {
                result += node.val;
            }

            if (node.left != null) {
                node.left.val = node.val * 2 + node.left.val;
                queue.add(node.left);
            }

            if (node.right != null) {
                node.right.val = node.val * 2 + node.right.val;
                queue.add(node.right);
            }
        }

        return result;
    }
}
