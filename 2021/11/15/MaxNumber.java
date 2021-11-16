/**
 * https://leetcode.com/problems/maximum-69-number/
 * @author Andrew Jarombek
 * @since 11/15/2021
 */

public class MaxNumber {
    public int maximum69Number (int num) {
        String numString = String.valueOf(num);

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == '6') {
                return Integer.parseInt(numString.substring(0, i) + "9" + numString.substring(i + 1));
            }
        }

        return num;
    }
}
