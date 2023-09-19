/*
 * https://leetcode.com/problems/binary-gap/
 * @author Andrew Jarombek
 * @since 9/19/2023
 */

package com.jarombek;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilarV1(TreeNode root1, TreeNode root2) {
        return leafNodesToStringV1(root1).equals(leafNodesToStringV1(root2));
    }

    public String leafNodesToStringV1(TreeNode root) {
        var builder = new StringBuilder();
        var queue = new ArrayDeque<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var node = queue.removeFirst();

            if (node.left == null && node.right == null) {
                builder.append(node.val).append(',');
            } else {
                if (node.left != null) {
                    queue.addLast(node.left);
                }

                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
        }

        return builder.toString();
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        leafNodesToString(root1, list1);
        leafNodesToString(root2, list2);

        return list1.equals(list2);
    }

    public void leafNodesToString(TreeNode root, List<Integer> list) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            if (root.left != null) {
                leafNodesToString(root.left, list);
            }

            if (root.right != null) {
                leafNodesToString(root.right, list);
            }
        }
    }
}
