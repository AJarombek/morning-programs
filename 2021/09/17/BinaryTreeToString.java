/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 * @author Andrew Jarombek
 * @since 9/17/2021
 */

public class BinaryTreeToString {
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
    
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);

        if (root.left != null) {
            sb.append("(");
            sb.append(tree2str(root.left));
            sb.append(")");
        }

        if (root.right != null) {
            if (root.left == null) {
                sb.append("()");
            }

            sb.append("(");
            sb.append(tree2str(root.right));
            sb.append(")");
        }

        return sb.toString();
    }

    // Made it to the final rd of interviews at AMZN for a SDE II job, but got rejected.
    // Moments like this I wish more than anything that I could listen to your advice and hear what you'd have to say.
}
