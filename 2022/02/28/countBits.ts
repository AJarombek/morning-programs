/**
 * https://leetcode.com/problems/counting-bits/
 * @author Andrew Jarombek
 * @since 2/28/2022
 */

function countBits(n: number): number[] {
    let result = [];

    for (let i = 0; i <= n; i++) {
        let bits = 0;
        let value = i;

        while (value > 0) {
            bits += value % 2;
            value >>= 1;
        }

        result.push(bits);
    }

    return result;
}