/**
 * https://leetcode.com/problems/rotate-string/
 * @author Andrew Jarombek
 * @since 1/2/2023
 */

const rotateString = function(s, goal) {
    if (s.length !== goal.length) {
        return false;
    }

    return (s + s).includes(goal);
}

console.assert(rotateString("abcde", "cdeab"));
console.assert(!rotateString("abcde", "abced"));
