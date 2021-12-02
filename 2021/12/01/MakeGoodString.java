/**
 * https://leetcode.com/problems/make-the-string-great/
 * @author Andrew Jarombek
 * @since 12/1/2021
 */

public class MakeGoodString {
    public String makeGood(String s) {
        boolean done = false;
        StringBuilder sb = new StringBuilder();

        while (!done) {
            int index = 0;
            done = true;

            while (index < s.length() - 1) {
                char c = s.charAt(index);

                if (c == s.charAt(index + 1) - 32 || c == s.charAt(index + 1) + 32) {
                    index += 2;
                    done = false;
                } else {
                    sb.append(c);
                    index++;
                }
            }

            if (index < s.length()) {
                sb.append(s.charAt(index));
            }

            if (!done) {
                s = sb.toString();
                sb = new StringBuilder();
            }
        }

        return sb.toString();
    }
}
