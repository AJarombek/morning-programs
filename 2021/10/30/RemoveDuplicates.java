/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * @author Andrew Jarombek
 * @since 10/30/2021
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 0) {
            Character c1 = deque.removeFirst();
            Character c2 = null;

            if (deque.size() > 0) {
                c2 = deque.removeFirst();
            }

            if (c2 == null || c1 != c2) {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c1) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(c1);
                }

                if (c2 != null)
                    deque.addFirst(c2);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String result = removeDuplicates("aababaab");
        assert result.equals("ba");
    }
}
