/**
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 * @author Andrew Jarombek
 * @since 1/5/2023
 */

const shortestToChar = function(s, c) {
    const locations = [-Infinity];

    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) === c) {
            locations.push(i);
        }
    }

    locations.push(Infinity);
    const result = [];
    let index = 0;

    for (let i = 0; i < s.length; i++) {
        const val = Math.min(i - locations[index], locations[index+1] -i);
        result.push(val);

        if (val === 0) {
            index++;
        }
    }

    return result;
}

const result = shortestToChar("aaab", "b");
const expected = [3,2,1,0]

console.assert(result.every((value, index) => value === expected[index]));
