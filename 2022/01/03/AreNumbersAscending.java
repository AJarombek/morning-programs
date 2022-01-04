/**
 * https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
 * @author Andrew Jarombek
 * @since 1/3/2022
 */

public class AreNumbersAscending {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prev = 0;

        for (String str : arr) {
            char c = str.charAt(0);

            if (c <= '9' && c >= '0') {
                int val = Integer.parseInt(str);

                if (val > prev) {
                    prev = val;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
