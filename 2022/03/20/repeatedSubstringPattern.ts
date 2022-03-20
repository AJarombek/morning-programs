/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 * @author Andrew Jarombek
 * @since 3/20/2022
 */

function repeatedSubstringPattern(s: string): boolean {
    for (let i = 1; i <= s.length / 2; i++) {
        if (s.substring(i, s.length) + s.substring(0, i) == s) {
            return true;
        }
    }

    return false;
}