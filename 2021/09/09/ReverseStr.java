/**
 * https://leetcode.com/problems/reverse-string-ii/
 * @author Andrew Jarombek
 * @since 9/9/2021
 */

public class ReverseStr {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= s.length() / k; i++) {
            int start = i * k;
            int end = Math.min(s.length(), (i + 1) * k);

            String substring = s.substring(start, end);

            if (i % 2 == 0) {
                for (int j = substring.length() - 1; j >= 0; j--) {
                    sb.append(substring.charAt(j));
                }
            } else {
                sb.append(substring);
            }
        }

        return sb.toString();
    }
}
