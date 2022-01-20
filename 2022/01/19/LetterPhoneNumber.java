/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * @author Andrew Jarombek
 * @since 1/19/2022
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList();
        }

        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));

        List<String> result = map.get(digits.charAt(0));

        if (digits.length() == 1) {
            return result;
        }

        for (int i = 1; i < digits.length(); i++) {
            List<String> newResult = new ArrayList<>();
            List<String> chars = map.get(digits.charAt(i));

            for (int k = 0; k < result.size(); k++) {
                String s = result.get(k);

                for (int j = 0; j < chars.size(); j++) {
                    newResult.add(s + chars.get(j));
                }
            }

            result = newResult;
        }

        return result;
    }
}
