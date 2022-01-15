/**
 * https://leetcode.com/problems/reverse-integer/
 * @author Andrew Jarombek
 * @since 1/14/2022
 */

public class ReverseInteger {
    public int reverse(int x) {
        int value = x;
        int result = 0;
        int prev = 0;
        x = Math.abs(x);

        while (x > 0) {
            prev = result;
            result *= 10;
            result += x % 10;
            x /= 10;
        }

        if (prev != result / 10)
            return 0;

        return value > 0 ? result : -result;
    }
}
