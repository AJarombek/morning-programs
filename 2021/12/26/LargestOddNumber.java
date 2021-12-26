/**
 * https://leetcode.com/problems/largest-odd-number-in-string/
 * @author Andrew Jarombek
 * @since 12/26/2021
 */

public class LargestOddNumber {
    public String largestOddNumber(String num) {
        int end = num.length() - 1;

        while (end >= 0) {
            if (num.charAt(end) % 2 == 1) {
                return num.substring(0, end + 1);
            }

            end--;
        }

        return "";
    }
}
