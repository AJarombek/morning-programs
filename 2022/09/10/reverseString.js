/**
 * https://leetcode.com/problems/reverse-string-ii/
 * @author Andrew Jarombek
 * @since 9/10/2022
 */

const reverseStr = function(s, k) {
    let index = 0;
    let result = [];

    while (index < s.length) {
        let end = Math.min(s.length - 1, index + k - 1);
        for (let i = end; i >= index; i--) {
            result.push(s.charAt(i));
        }

        index = end + 1;
        end = Math.min(s.length, index + k);

        for (let i = index; i < end; i++) {
            result.push(s.charAt(i));
        }

        index = end;
    }

    return result.join("");
};

console.assert(reverseStr("abcdefgh", 4) === "dcbaefgh");
console.assert(reverseStr("abcd", 2) === "bacd");
