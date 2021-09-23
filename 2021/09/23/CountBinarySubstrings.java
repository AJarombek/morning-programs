/**
 * https://leetcode.com/problems/count-binary-substrings/
 * @author Andrew Jarombek
 * @since 9/23/2021
 */

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int previous = 0;
        int current = 0;
        char currentChar = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                current++;
            } else {
                previous = current;
                current = 1;
                currentChar = c;
            }

            if (current > 0 && previous > 0 && current <= previous) {
                count++;
            }
        }

        return count;
    }
}
