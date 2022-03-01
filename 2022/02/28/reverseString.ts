/**
 * https://leetcode.com/problems/reverse-string/
 * @author Andrew Jarombek
 * @since 2/28/2022
 */

function reverseString(s: string[]): void {
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        let temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start++;
        end--;
    }
}