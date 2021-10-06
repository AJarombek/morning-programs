/**
 * https://leetcode.com/problems/most-common-word/
 * @author Andrew Jarombek
 * @since 10/5/2021
 */

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> instances = new HashMap<>();

        int highestCount = 0;
        String mostCommon = null;

        for (String word : paragraph.toLowerCase().replaceAll("[!\\?',;\\.]{1}", "").split(" ")) {
            if (!bannedSet.contains(word)) {
                Integer count = instances.get(word);

                if (count == null) {
                    count = 1;
                } else {
                    count++;
                }

                instances.put(word, count);

                if (count > highestCount) {
                    highestCount = count;
                    mostCommon = word;
                }
            }
        }

        return mostCommon;
    }
}
