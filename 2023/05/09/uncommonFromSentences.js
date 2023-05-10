/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * @author Andrew Jarombek
 * @since 5/9/2023
 */

const assert = require('assert');

const uncommonFromSentences = function(s1, s2) {
    const values = {};

    for (let s of s1.split(" ")) {
        const value = values[s] ?? 0;
        values[s] = value + 1;
    }

    for (let s of s2.split(" ")) {
        const value = values[s] ?? 0;
        values[s] = value + 1;
    }

    const result = [];

    for (let [key, value] of Object.entries(values)) {
        if (value === 1) {
            result.push(key);
        }
    }

    return result;
};

// Test case 1: Sentences with uncommon words
let s1 = "this is a test";
let s2 = "is test uncommon";
assert.deepStrictEqual(uncommonFromSentences(s1, s2), ["this", "a", "uncommon"], 'Test case 1 failed');

// Test case 2: Sentences with no uncommon words
let s3 = "hello world";
let s4 = "hello world";
assert.deepStrictEqual(uncommonFromSentences(s3, s4), [], 'Test case 2 failed');
