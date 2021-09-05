/**
 * https://leetcode.com/problems/keyboard-row/
 * @author Andrew Jarombek
 * @since 9/5/2021
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        List<Character> row1List = List.of(
            'Q', 'q', 'W', 'w', 'E', 'e', 'R', 'r', 'T', 't', 'Y', 'y', 'U', 'u', 'I', 'i', 'O', 'o', 'P', 'p'
        );
        Set<Character> row1 = new HashSet<>(row1List);

        List<Character> row2List = List.of(
            'A', 'a', 'S', 's', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l'
        );
        Set<Character> row2 = new HashSet<>(row2List);

        List<Character> row3List = List.of(
            'Z', 'z', 'X', 'x', 'C', 'c', 'V', 'v', 'B', 'b', 'N', 'n', 'M', 'm'
        );
        Set<Character> row3 = new HashSet<>(row3List);

        List<String> result = new ArrayList<>();

        for (String word: words) {
            boolean inRow3 = true;

            for (char c: word.toCharArray()) {
                if (!row3.contains(c)) {
                    inRow3 = false;
                    break;
                }
            }

            if (inRow3) {
                result.add(word);
                continue;
            }

            boolean inRow2 = true;

            for (char c: word.toCharArray()) {
                if (!row2.contains(c)) {
                    inRow2 = false;
                    break;
                }
            }

            if (inRow2) {
                result.add(word);
                continue;
            }

            boolean inRow1 = true;

            for (char c: word.toCharArray()) {
                if (!row1.contains(c)) {
                    inRow1 = false;
                    break;
                }
            }

            if (inRow1) {
                result.add(word);
                continue;
            }
        }

        String[] resultArray = new String[result.size()];
        result.toArray(resultArray);
        return resultArray;
    }
}
