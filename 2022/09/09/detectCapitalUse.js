/**
 * https://leetcode.com/problems/detect-capital/
 * @author Andrew Jarombek
 * @since 9/9/2022
 */

const detectCapitalUse = function(word) {
    let lower = false;
    let count = 0;

    for (let c of word) {
        if (c.toLowerCase() === c) {
            if (!lower && count > 1)
                return false;

            lower = true;
        } else {
            if (lower)
                return false;
        }

        count++;
    }

    return true;
}

console.assert(detectCapitalUse("Andy"));
console.assert(detectCapitalUse("andy"));
console.assert(detectCapitalUse("ANDY"));
console.assert(!detectCapitalUse("anDy"));
console.assert(!detectCapitalUse("AnDy"));
console.assert(!detectCapitalUse("ANdy"));