/**
 * https://leetcode.com/problems/complement-of-base-10-integer/
 * @author Andrew Jarombek
 * @since 6/3/2022
 */

function bitwiseComplement(n: number): number {
    if (n == 0)
        return 1;

    let result = 0;
    let i = 1;

    while (n > 0) {
        if (n % 2 == 0)
            result += i;

        i <<= 1;
        n >>= 1;
    }

    return result;
}