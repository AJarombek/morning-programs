/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * @author Andrew Jarombek
 * @since 10/27/2021
 */

public class RemoveOuterParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c: s.toCharArray()) {
            if (c == '(') {
                depth += 1;

                if (depth > 1) {
                    sb.append(c);
                }
            } else {
                depth -= 1;

                if (depth > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
