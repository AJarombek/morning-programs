/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * @author Andrew Jarombek
 * @since 9/29/2021
 */

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorder {
    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        for (Node child: root.children) {
            if (child != null) {
                result.addAll(this.postorder(child));
            }
        }

        result.add(root.val);
        return result;
    }
}
