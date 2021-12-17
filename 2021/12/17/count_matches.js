/**
 * https://leetcode.com/problems/count-items-matching-a-rule/
 * @author Andrew Jarombek
 * @since 12/17/2021
 */

const countMatches = function(items, ruleKey, ruleValue) {
    const indices = { type: 0, color: 1, name: 2 };
    let matches = 0;

    const index = indices[ruleKey];

    for (let item of items) {
        if (item[index] === ruleValue) {
            matches++;
        }
    }

    return matches;
};