/**
 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
 * @author Andrew Jarombek
 * @since 12/22/2021
 */

public class CountGoodSubstrings {
    public int countGoodSubstrings(String s) {
        int result = 0;

        for (int i = 2; i < s.length(); i++) {
            char x = s.charAt(i - 2);
            char y = s.charAt(i - 1);
            char z = s.charAt(i);

            if (x != y && x != z && y != z) {
                result++;
            }
        }

        return result;
    }
}
