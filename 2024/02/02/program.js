/**
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * @author Andrew Jarombek
 * @since 2/2/2024
 */

/**
 * @param {string[]} words
 * @param {string} order
 * @return {boolean}
 */
const isAlienSorted = function(words, order) {
    const chars = new Map();

    for (let i = 0; i < order.length; i++) {
        chars.set(order.charAt(i), i);
    }

    for (let i = 1; i < words.length; i++) {
        const current = words[i];
        const previous = words[i-1];

        if (current === previous)
            continue;

        if (previous.length > current.length && previous.substring(0, current.length) === current)
            return false;

        const length = Math.min(previous.length, current.length);

        for (let index = 0; index < length; index++) {
            const val = chars.get(current.charAt(index)) - chars.get(previous.charAt(index));

            if (val > 0)
                break;

            if (val < 0)
                return false;
        }
    }

    return true;
};
