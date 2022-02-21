/**
 * https://leetcode.com/problems/power-of-two/
 * @author Andrew Jarombek
 * @since 2/20/2022
 */

function isPowerOfTwo(n: number): boolean {
    if (n <= 0) {
        return false;
    }

    while (n > 1) {
        if (n % 2 == 1) {
            return false;
        }

        n /= 2;
    }

    return true;
}