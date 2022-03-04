/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * @author Andrew Jarombek
 * @since 3/3/2022
 */

function firstUniqChar(s: string): number {
    const map = new Map<string, number>();

    for (let c of s) {
        map.set(c, (map.get(c) ?? 0) + 1);
    }

    for (let i = 0; i < s.length; i++) {
        if (map.get(s.charAt(i)) == 1) {
            return i;
        }
    }

    return -1;
}
