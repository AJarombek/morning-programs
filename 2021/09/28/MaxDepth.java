/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * @author Andrew Jarombek
 * @since 9/28/2021
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class MaxDepth {
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

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (queue.size() > 0) {
            depth++;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();

                for (Node child: node.children) {
                    if (child != null) {
                        queue.add(child);
                    }
                }
            }
        }

        return depth;
    }
}
