/**
 * https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 * @author Andrew Jarombek
 * @since 12/27/2021
 */

const areOccurrencesEqual = function(s) {
    const map = new Map();

    for (let c of s) {
        map.set(c, (map.get(c) ?? 0) + 1);
    }

    const set = new Set();
    for (let [_, value] of map) {
        set.add(value);
    }

    return set.size === 1;
};