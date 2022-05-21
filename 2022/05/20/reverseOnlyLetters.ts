/**
 * https://leetcode.com/problems/reverse-only-letters/
 * @author Andrew Jarombek
 * @since 5/20/2022
 */

function reverseOnlyLetters(s: string): string {
    const chars = s.split("");
    const regex = /^[A-Za-z]$/;
    let start = 0;
    let end = chars.length - 1;

    while (start < end) {
        if (!regex.test(chars[start])) {
            start++;
        } else if (!regex.test(chars[end])) {
            end--;
        } else {
            const temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
            start++;
            end--;
        }
    }

    return chars.join("");
}