/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * @author Andrew Jarombek
 * @since 12/26/2022
 */

const nextGreatestLetter = function(letters, target) {
    for (let letter of letters) {
        if (letter > target) {
            return letter;
        }
    }

    return letters[0];
};

console.assert(nextGreatestLetter(["c","f","j"], "a") === "c");
console.assert(nextGreatestLetter(["x","x","y","y"], "z") === "x");
