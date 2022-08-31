/*
 * https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
 * @author Andrew Jarombek
 * @since 8/30/2022
 */

public class ModifyString {
    public static String modifyString(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char replacement = 'a';

            if (c == '?') {
                boolean prev = i == 0 || chars[i - 1] != replacement;
                boolean next = i == chars.length - 1 || chars[i + 1] != replacement;

                while (!prev || !next) {
                    replacement += 1;
                    prev = i == 0 || chars[i - 1] != replacement;
                    next = i == chars.length - 1 || chars[i + 1] != replacement;
                }

                chars[i] = replacement;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        assert modifyString("?zs").equals("azs");
        assert modifyString("ubv?w").equals("ubvaw");
        assert modifyString("ubva???d").equals("ubvababd");
    }
}
