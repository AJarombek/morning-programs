/**
 * https://leetcode.com/problems/occurrences-after-bigram/
 * @author Andrew Jarombek
 * @since 10/31/2021
 */

import java.util.ArrayList;
import java.util.List;

public class OccurrencesBigram {
    public String[] findOccurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();

        String firstStr = "";
        String secondStr = "";

        for (String s : text.split(" ")) {
            if (first.equals(firstStr) && second.equals(secondStr)) {
                result.add(s);
            }

            firstStr = secondStr;
            secondStr = s;
        }

        return result.toArray(new String[0]);
    }
}
