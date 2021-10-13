/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * @author Andrew Jarombek
 * @since 10/12/2021
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> s1Map = new HashMap<>();
        Map<String, Integer> s2Map = new HashMap<>();

        String[] s1Words = s1.split(" ");
        String[] s2Words = s2.split(" ");

        for (String s : s1Words) {
            int count = s1Map.containsKey(s) ? s1Map.get(s) + 1 : 1;
            s1Map.put(s, count);
        }

        for (String s : s2Words) {
            int count = s2Map.containsKey(s) ? s2Map.get(s) + 1 : 1;
            s2Map.put(s, count);
        }

        List<String> result = new ArrayList<>();

        for (String s : s1Words) {
            if (s1Map.containsKey(s) && s1Map.get(s) == 1 && s2Map.get(s) == null) {
                result.add(s);
            }
        }

        for (String s : s2Words) {
            if (s2Map.containsKey(s) && s2Map.get(s) == 1 && s1Map.get(s) == null) {
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }
}
