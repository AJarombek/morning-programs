/**
 * https://leetcode.com/problems/string-matching-in-an-array/
 * @author Andrew Jarombek
 * @since 11/22/2021
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(word)) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;
    }

    public List<String> stringMatchingFaster(String[] words) {
        List<String> result = new ArrayList<>();
        String allWords = String.join(" ", words);

        for (String word : words) {
            if (matchCount(allWords, word) > 1) {
                result.add(word);
            }
        }

        return result;
    }

    public static int matchCount(String text, String str) {
        int index = 0;
        int count = 0;

        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count++;
                index += str.length();
            } else {
                break;
            }
        }

        return count;
    }
}
