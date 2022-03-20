/**
 * https://leetcode.com/problems/assign-cookies/
 * @author Andrew Jarombek
 * @since 3/20/2022
 */

function assignCookies(g: number[], s: number[]): number {
    g.sort((a, b) => a - b);
    s.sort((a, b) => a - b);

    let i = 0;
    let j = 0;

    for (let val of s) {
        if (g[i] <= val) {
            i++;
        }

        j++;
    }

    return i;
}