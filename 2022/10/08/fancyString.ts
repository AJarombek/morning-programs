/**
 * https://leetcode.com/problems/delete-characters-to-make-fancy-string/
 * @author Andrew Jarombek
 * @since 10/8/2022
 */

function makeFancyString(s: string): string {
    let result = [];
    let index = 0;

    while (index + 2 < s.length) {
        const c = s.charAt(index);

        if (c != s.charAt(index + 1) || c != s.charAt(index + 2)) {
            result.push(c);
        }

        index++;
    }

    result.push(s.substring(index));
    return result.join("");
}