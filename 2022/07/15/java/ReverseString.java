/**
 * https://leetcode.com/problems/reverse-string/
 * @author Andrew Jarombek
 * @since 7/15/2022
 */

public class ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char c = s[start];
            s[start] = s[end];
            s[end] = c;

            start++;
            end--;
        }
    }

    // Less memory usage, but longer runtime.
    // Solution #1 is likely preferable due to the faster runtime.
    public static void reverseStringV2(char[] s) {
        int start = 0;

        while (start < s.length / 2) {
            char c = s[s.length - start - 1];
            s[s.length - start - 1] = s[start];
            s[start] = c;

            start++;
        }
    }

    public static void main(String[] args) {
        char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
        reverseString(chars);

        assert chars[0] == 'o';
        assert chars[1] == 'l';
        assert chars[2] == 'l';
        assert chars[3] == 'e';
        assert chars[4] == 'H';

        reverseStringV2(chars);

        assert chars[0] == 'H';
        assert chars[1] == 'e';
        assert chars[2] == 'l';
        assert chars[3] == 'l';
        assert chars[4] == 'o';
    }
}
