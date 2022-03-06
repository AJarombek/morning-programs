/**
 * https://leetcode.com/problems/arranging-coins/
 * @author Andrew Jarombek
 * @since 3/6/2022
 */

function arrangeCoins(n: number): number {
    let rows = 0;

    while (n > 0) {
        if (n >= rows + 1) {
            rows += 1;
        }

        n -= rows;
    }

    return rows;
}