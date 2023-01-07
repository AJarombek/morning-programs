/**
 * https://leetcode.com/problems/positions-of-large-groups/
 * @author Andrew Jarombek
 * @since 1/7/2023
 */

const largeGroupPositions = function(s) {
    const result = [];
    let prev = '';
    let start = 0;

    for (let i = 0; i < s.length; i++) {
        const c = s.charAt(i);

        if (c !== prev) {
            if (i > start + 2) {
                result.push([start, i-1]);
            }

            prev = c;
            start = i;
        }
    }

    if (s.length > start + 2) {
        result.push([start, s.length-1]);
    }

    return result;
};

let result = largeGroupPositions("abc");

console.assert(result.length === 0);

let expected = [[3,5],[6,9],[12,14]];
result = largeGroupPositions("abcdddeeeeaabbbcd");

console.assert(result.every((list, i) => list.every((value, j) => value === expected[i][j])));
