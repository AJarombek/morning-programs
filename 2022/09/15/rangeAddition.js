/**
 * https://leetcode.com/problems/range-addition-ii/
 * @author Andrew Jarombek
 * @since 9/15/2022
 */

const maxCount = function(m, n, ops) {
    let x = m;
    let y = n;

    for (let op of ops) {
        x = Math.min(x, op[0]);
        y = Math.min(y, op[1]);
    }

    return x * y;
};

console.assert(maxCount(3, 3, [[2, 2], [3, 3]]) === 4);
console.assert(maxCount(3, 3, []) === 9);
