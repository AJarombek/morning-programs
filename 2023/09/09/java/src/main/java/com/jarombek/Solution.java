/*
 * https://leetcode.com/problems/most-common-word/
 * @author Andrew Jarombek
 * @since 9/9/2023
 */

package com.jarombek;

import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split(" ");
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String mostCommonWord = "";
        int mostCommonWordCount = 0;
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (cleanedWord.equals("") || bannedSet.contains(cleanedWord)) {
                continue;
            }

            int count = wordCountMap.getOrDefault(cleanedWord, 0) + 1;

            if (count > mostCommonWordCount) {
                mostCommonWord = cleanedWord;
                mostCommonWordCount = count;
            }

            wordCountMap.put(cleanedWord, count);
        }

        return mostCommonWord;
    }
}
