/*
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * @author Andrew Jarombek
 * @since 4/20/2023
 */

package com.jarombek;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> result = null;

    public List<Integer> preorder(Node root) {
        this.result = new ArrayList<>();

        if (root != null)
            dfs(root);

        return this.result;
    }

    private void dfs(Node root) {
        this.result.add(root.val);

        for (var child : root.children) {
            if (child != null) {
                dfs(child);
            }
        }
    }
}
