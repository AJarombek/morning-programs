/**
 * https://leetcode.com/problems/count-binary-substrings/
 * @author Andrew Jarombek
 * @since 12/23/2022
 */

const countBinarySubstrings = function(s) {
    let prev = s.charAt(0);
    let result = 0;
    let values = [1, 0];

    for (let i = 1; i < s.length; i++) {
        if (s.charAt(i) === prev) {
            values[0]++;
        } else {
            result += Math.min(values[0], values[1]);
            prev = s.charAt(i);
            values[1] = values[0];
            values[0] = 1;
        }
    }

    return result + Math.min(values[0], values[1]);
};

console.assert(countBinarySubstrings("00110011") === 10);
console.assert(countBinarySubstrings("10101") === 4);
