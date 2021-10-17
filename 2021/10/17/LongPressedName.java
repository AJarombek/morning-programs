/**
 * https://leetcode.com/problems/long-pressed-name/
 * @author Andrew Jarombek
 * @since 10/17/2021
 */

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }

        if (name.length() > typed.length()) {
            return false;
        }

        int index = 0;
        Character prev = null;

        for (char c: name.toCharArray()) {
            if (prev == null || prev != c) {
                while (prev != null && index < typed.length() && typed.charAt(index) == prev) {
                    index++;
                }

                prev = c;
            }

            if (index == typed.length() || typed.charAt(index) != c) {
                return false;
            }

            index++;
        }

        while (prev != null && index < typed.length() && typed.charAt(index) == prev) {
            index++;
        }

        if (index < typed.length()) {
            return false;
        }

        return true;
    }
}
