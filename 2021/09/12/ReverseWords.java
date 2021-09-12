/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * @author Andrew Jarombek
 * @since 9/12/2021
 */

public class ReverseWords {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (end == start) {
                    sb.append(c);
                } else {
                    for (int j = end - 1; j >= start; j--) {
                        sb.append(s.charAt(j));
                    }

                    sb.append(c);
                }

                start = i + 1;
                end = i + 1;
            } else {
                end++;
            }
        }

        for (int j = end - 1; j >= start; j--) {
            sb.append(s.charAt(j));
        }

        return sb.toString();
    }
}
