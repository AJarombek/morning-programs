/**
 * https://leetcode.com/problems/buddy-strings/
 * @author Andrew Jarombek
 * @since 1/9/2023
 */

// I can live like that with you.

const buddyStrings = function(s, goal) {
    if (s === goal) {
        const set = new Set();

        for (let c of s) {
            if (set.has(c)) {
                return true;
            }

            set.add(c);
        }

        return false;
    }

    if (s.length !== goal.length)
        return false;

    const mismatches = [];

    for (let i = 0; i < s.length; i++) {
        const c1 = s.charAt(i);
        const c2 = goal.charAt(i);

        if (c1 !== c2) {
            mismatches.push([c1, c2]);
        }
    }

    return (
        mismatches.length === 2 &&
        mismatches[0][0] === mismatches[1][1] &&
        mismatches[0][1] === mismatches[1][0]
    );
}