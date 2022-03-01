/**
 * https://leetcode.com/problems/power-of-four/
 * @author Andrew Jarombek
 * @since 2/28/2022
 */

function isPowerOfFour(n: number): boolean {
    if (n <= 0) {
        return false;
    }

    while (n > 1) {
        if (n % 4 != 0) {
            return false;
        }

        n /= 4;
    }

    return true;
}