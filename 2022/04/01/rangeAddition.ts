/**
 * https://leetcode.com/problems/range-addition-ii/
 * @author Andrew Jarombek
 * @since 4/1/2022
 */

function maxCount(m: number, n: number, ops: number[][]): number {
    let x = m;
    let y = n;

    for (let op of ops) {
        x = Math.min(op[0], x);
        y = Math.min(op[1], y);
    }

    return x * y;
}