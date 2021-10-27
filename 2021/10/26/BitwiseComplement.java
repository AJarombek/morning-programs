/**
 * https://leetcode.com/problems/complement-of-base-10-integer/
 * @author Andrew Jarombek
 * @since 10/26/2021
 */

public class BitwiseComplement {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        int mask = 1;
        int m = n;

        while (m > 0) {
            mask *= 2;
            m /= 2;
        }

        return (mask - 1) ^ n;
    }
}
