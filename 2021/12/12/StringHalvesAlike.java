/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 * @author Andrew Jarombek
 * @since 12/12/2021
 */

import java.util.HashSet;
import java.util.Set;

public class StringHalvesAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int first = 0;
        int second = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (set.contains(s.charAt(i))) {
                first++;
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                second++;
            }
        }

        return first == second;
    }
}
