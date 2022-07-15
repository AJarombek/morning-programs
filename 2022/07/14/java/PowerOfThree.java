/**
 * https://leetcode.com/problems/power-of-three/
 * @author Andrew Jarombek
 * @since 7/14/2022
 */

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;

        while (n > 1) {
            if (n % 3 == 0) {
                n /= 3;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        assert !isPowerOfThree(0);
        assert isPowerOfThree(9);
    }
}
