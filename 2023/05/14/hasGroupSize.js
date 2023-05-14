/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * @author Andrew Jarombek
 * @since 5/12/2023
 */

const assert = require('assert');

function hasGroupsSize(deck) {
    const map = new Map();
    let gcd = 0;

    for (let num of deck) {
        const val = (map.get(num) ?? 0) + 1;
        map.set(num, val);
        gcd = Math.max(gcd, val);
    }

    for (let val of map.values()) {
        gcd = greatestCommonDivisor(Math.min(gcd, val), Math.max(gcd, val));
    }

    return gcd >= 2;
}

function greatestCommonDivisor(x, y) {
    return x === 0 ? y : greatestCommonDivisor(y % x, x);
}

// Test case 1: Valid groups
const deck1 = [1, 1, 2, 2, 3, 3];
assert.strictEqual(hasGroupsSize(deck1), true, 'Test case 1 failed');

// Test case 2: Invalid groups
const deck2 = [1, 1, 1, 2, 2, 2, 3, 3];
assert.strictEqual(hasGroupsSize(deck2), false, 'Test case 2 failed');
