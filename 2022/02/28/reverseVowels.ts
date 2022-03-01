/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * @author Andrew Jarombek
 * @since 2/28/2022
 */

function reverseVowels(s: string): string {
    let start = 0;
    let end = s.length - 1;
    let str = s.split("");
    let vowels = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']);

    while (start < end) {
        while (start < end && !vowels.has(str[start])) {
            start++;
        }

        while (end > start && !vowels.has(str[end])) {
            end--;
        }

        if (start < end) {
            let temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    return str.join("");
}