/**
 * https://leetcode.com/problems/binary-number-with-alternating-bits/
 * @author Andrew Jarombek
 * @since 4/10/2022
 */

function hasAlternatingBits(n: number): boolean {
    let prev = n % 2 == 0 ? 1 : 0;

    while (n > 0) {
        let bit = n % 2;
        if (bit != prev) {
            prev = bit;
        } else {
            return false;
        }

        n = Math.floor(n / 2);
    }

    return true;
}