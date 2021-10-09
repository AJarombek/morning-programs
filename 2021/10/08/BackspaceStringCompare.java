/**
 * https://leetcode.com/problems/backspace-string-compare/
 * @author Andrew Jarombek
 * @since 10/8/2021
 */

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        String a = this.buildString(s);
        String b = this.buildString(t);
        return a.equals(b);
    }

    private String buildString(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
