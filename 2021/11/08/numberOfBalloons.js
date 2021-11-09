/**
 * https://leetcode.com/problems/maximum-number-of-balloons/
 * @author Andrew Jarombek
 * @since 11/8/2021
 */

const maxNumberOfBalloons = function(text) {
    const set = new Set();
    set.add('b');
    set.add('a');
    set.add('l');
    set.add('o');
    set.add('n');

    const map = {'b': 0, 'a': 0, 'l': 0, 'o': 0, 'n': 0};

    for (const c of text) {
        if (set.has(c)) {
            map[c] = map[c] + 1;
        }
    }

    return Math.min(map['b'], map['a'], Math.floor(map['l'] / 2), Math.floor(map['o'] / 2), map['n']);
};