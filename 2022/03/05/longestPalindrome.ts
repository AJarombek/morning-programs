/**
 * https://leetcode.com/problems/longest-palindrome/
 * @author Andrew Jarombek
 * @since 3/5/2022
 */

function longestPalindrome(s: string): number {
    const chars = new Map<string, number>();

    for (let c of s) {
        chars.set(c, (chars.get(c) ?? 0) + 1);
    }

    let total = 0;
    let odd = 0;
    let oddChar = '';

    for (let [key, val] of chars.entries()) {
        if (val % 2 == 0) {
            total += val;
        } else if (val > odd) {
            total += Math.max(0, odd - 1);
            odd = val;
            oddChar = key;
        } else {
            total += val - 1;
        }
    }

    return total + odd;
}
