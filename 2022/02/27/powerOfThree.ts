/**
 * https://leetcode.com/problems/power-of-three/
 * @author Andrew Jarombek
 * @since 2/27/2022
 */

function isPowerOfThree(n: number): boolean {
    if (n <= 0) {
        return false;
    }

    while (n > 1) {
        if (n % 3 != 0) {
            return false;
        }

        n /= 3;
    }

    return true;
}