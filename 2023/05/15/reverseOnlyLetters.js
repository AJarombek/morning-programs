/**
 * https://leetcode.com/problems/reverse-only-letters/
 * @author Andrew Jarombek
 * @since 5/15/2023
 */

const assert = require('assert');

const reverseOnlyLetters = function(s) {
    const chars = s.split('');
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        const c1 = chars[start];
        if (!((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z'))) {
            start++;
            continue;
        }

        const c2 = chars[end];

        if (!((c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z'))) {
            end--;
            continue;
        }

        chars[start] = c2;
        chars[end] = c1;
        start++;
        end--;
    }

    return chars.join('');
};

// Test case 1: Reversing letters in a string
assert.strictEqual(reverseOnlyLetters('ab-cd'), 'dc-ba');

// Test case 2: Reversing letters in a string with mixed characters
assert.strictEqual(reverseOnlyLetters('a-bC-dEf-ghIj'), 'j-Ih-gfE-dCba');
