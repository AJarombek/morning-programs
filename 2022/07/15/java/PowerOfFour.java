/**
 * https://leetcode.com/problems/power-of-four/
 * @author Andrew Jarombek
 * @since 7/15/2022
 */

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;

        while (n > 1) {
            if (n % 4 == 0) {
                n /= 4;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        assert !isPowerOfFour(0);
        assert isPowerOfFour(16);
    }
}
