/**
 * https://leetcode.com/problems/find-the-town-judge/
 * @author Andrew Jarombek
 * @since 3/31/2024
 */

/**
 * @param {number} n
 * @param {number[][]} trust
 * @return {number}
 */
const findJudge = function(n, trust) {
    const rel = [];

    for (let i = 0; i < n; i++) {
        rel.push([0,0]);
    }

    for (let val of trust) {
        const person = rel[val[0] - 1];
        rel[val[0] - 1] = [person[0] + 1, person[1]];

        const trustee = rel[val[1] - 1];
        rel[val[1] - 1] = [trustee[0], trustee[1] + 1];
    }

    for (let i = 0; i < n; i++) {
        const person = rel[i];

        if (person[0] === 0 && person[1] === n - 1) {
            return i + 1;
        }
    }

    return -1;
}
