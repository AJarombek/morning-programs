/**
 * https://leetcode.com/problems/goat-latin/
 * @author Andrew Jarombek
 * @since 10/6/2021
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder();

        int index = 1;
        for (String s : sentence.split(" ")) {
            if (sb.length() > 0) {
                sb.append(' ');
            }

            if (vowels.contains(s.charAt(0))) {
                sb.append(s);
            } else {
                sb.append(s.substring(1));
                sb.append(s.charAt(0));
            }

            sb.append("ma");

            for (int i = 0; i < index; i++) {
                sb.append('a');
            }

            index++;
        }

        return sb.toString();
    }
}
