/**
 * https://leetcode.com/problems/truncate-sentence/
 * @author Andrew Jarombek
 * @since 12/20/2021
 */

const truncateSentence = function(s, k) {
    let spaces = 0;

    for (let i = 0; i < s.length; i++) {
        const c = s.charAt(i);

        if (c === ' ') {
            spaces++;

            if (spaces === k) {
                return s.substring(0, i);
            }
        }
    }

    return s;
};
