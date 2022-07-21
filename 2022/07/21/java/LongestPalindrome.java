import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-palindrome/
 * @author Andrew Jarombek
 * @since 7/21/2022
 */

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        boolean odd = false;

        for (int value : map.values()) {
            if (value % 2 != 0)
                odd = true;

            result += value - (value % 2);
        }

        if (odd)
            result++;

        return result;
    }

    public static void main(String[] args) {
        assert longestPalindrome("abccccdd") == 7;
    }
}
