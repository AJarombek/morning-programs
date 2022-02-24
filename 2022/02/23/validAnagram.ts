/**
 * https://leetcode.com/problems/valid-anagram/
 * @author Andrew Jarombek
 * @since 2/23/2022
 */

function isAnagram(s: string, t: string): boolean {
    let chars = new Map<string, number>();

    for (let c of s) {
        chars.set(c, (chars.get(c) ?? 0) + 1);
    }

    for (let c of t) {
        let count = chars.get(c);

        if (!count) {
            return false;
        }

        if (count == 1) {
            chars.delete(c);
        } else {
            chars.set(c, count - 1);
        }
    }

    return chars.size == 0;
}
