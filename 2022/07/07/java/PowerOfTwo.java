/**
 * https://leetcode.com/problems/power-of-two/
 * @author Andrew Jarombek
 * @since 7/7/2022
 */

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }

            n = n >> 1;
        }

        return true;
    }

    public static void main(String[] args) {
        assert !isPowerOfTwo(0);
        assert isPowerOfTwo(1);
        assert isPowerOfTwo(2);
        assert !isPowerOfTwo(3);
    }
}
