/**
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 * @author Andrew Jarombek
 * @since 12/21/2021
 */

public class ReplaceDigits {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            char c = s.charAt(i);
            sb.append(c);

            if (i + 1 < s.length()) {
                int offset = Integer.parseInt(s.substring(i + 1, i + 2));
                sb.append((char) (c + offset));
            }
        }

        return sb.toString();
    }
}
