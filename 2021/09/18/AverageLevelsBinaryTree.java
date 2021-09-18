/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * @author Andrew Jarombek
 * @since 9/17/2021
 */

import java.util.ArrayList;
import java.util.List;

public class AverageLevelsBinaryTree {
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
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        List<TreeNode> currentLevel = new ArrayList<>();
        currentLevel.add(root);

        List<TreeNode> nextLevel = new ArrayList<>();

        while (currentLevel.size() > 0) {
            double total = 0;

            for (TreeNode node : currentLevel) {
                total += node.val;

                if (node.left != null) {
                    nextLevel.add(node.left);
                }

                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }

            result.add(total / currentLevel.size());

            currentLevel = nextLevel;
            nextLevel = new ArrayList<>();
        }

        return result;
    }
}
