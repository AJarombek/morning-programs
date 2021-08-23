/**
 * https://leetcode.com/problems/reverse-string/
 * @author Andrew Jarombek
 * @since 8/23/2021
 */

public class ReverseString {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char[] string = new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseString(string);

        assert string[0] == 'o';
        assert string[1] == 'l';
        assert string[2] == 'l';
        assert string[3] == 'e';
        assert string[4] == 'h';
    }
}
