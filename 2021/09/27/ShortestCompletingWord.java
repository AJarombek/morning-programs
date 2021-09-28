/**
 * https://leetcode.com/problems/shortest-completing-word/
 * @author Andrew Jarombek
 * @since 9/27/2021
 */

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String lp = licensePlate.toLowerCase();
        Map<Character, Integer> lpMap = new HashMap<>();

        for (char c : lp.toCharArray()) {
            lpMap.put(c, lpMap.containsKey(c) ? lpMap.get(c) + 1 : 1);
        }

        int mostMatches = -1;
        String result = null;

        for (String word : words) {
            int matches = 0;
            Map<Character, Integer> wordMap = new HashMap<>();

            for (char c : word.toCharArray()) {
                Integer lpCount = lpMap.get(c);
                Integer wordCount = wordMap.get(c);
                wordCount = wordCount == null ? 0 : wordCount;

                if (lpCount != null && lpCount > wordCount) {
                    matches++;
                    wordMap.put(c, wordCount + 1);
                }
            }

            if (matches > mostMatches || (matches == mostMatches && word.length() < result.length())) {
                mostMatches = matches;
                result = word;
            }
        }

        return result;
    }
}
