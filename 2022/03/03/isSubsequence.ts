/**
 * https://leetcode.com/problems/is-subsequence/
 * @author Andrew Jarombek
 * @since 3/3/2022
 */

function isSubsequence(s: string, t: string): boolean {
    let i = 0;
    let j = 0;

    while (i < s.length && j < t.length) {
        const c = s.charAt(i);

        while (j < t.length) {
            const c2 = t.charAt(j);
            j++;

            if (c == c2) {
                i++;
                break;
            }
        }
    }

    return i == s.length;
}