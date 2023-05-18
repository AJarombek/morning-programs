/**
 * https://leetcode.com/problems/long-pressed-name/
 * @author Andrew Jarombek
 * @since 5/17/2023
 */

const assert = require('assert');

const isLongPressedName = function(name, typed) {
    let i = 0;
    let j = 0;
    let prev = null;

    while (i < name.length && j < typed.length) {
        const c = name.charAt(i);

        if (c !== prev) {
            while (j < typed.length && typed.charAt(j) === prev) {
                j++;
            }
        }

        if (j === typed.length || c !== typed.charAt(j)) {
            return false;
        }

        prev = c;
        j++;
        i++;
    }

    while (j < typed.length && typed.charAt(j) === prev) {
        j++;
    }

    return j === typed.length && i === name.length;
}

// Test case 1: Matching name and typed string
assert.strictEqual(isLongPressedName("hello", "hheelllloo"), true, 'Test case 1 failed');

// Test case 2: Non-matching name and typed string
assert.strictEqual(isLongPressedName("world", "wwoorrlldd"), true, 'Test case 2 failed');
