/**
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * @author Andrew Jarombek
 * @since 11/14/2021
 */

public class DecryptString {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append((char) (96 + Integer.parseInt(s.substring(i, i + 2))));
                i += 3;
            } else {
                sb.append((char) (96 + Integer.parseInt(s.substring(i, i + 1))));
                i++;
            }
        }

        return sb.toString();
    }
}
