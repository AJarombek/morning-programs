/**
 * https://leetcode.com/problems/find-the-difference/
 * @author Andrew Jarombek
 * @since 3/3/2022
 */

function findTheDifference(s: string, t: string): string {
    let map = new Map<string, number>();

    for (let c of s) {
        map.set(c, (map.get(c) ?? 0) + 1);
    }

    for (let c of t) {
        const count = map.get(c) ?? 0;

        if (count == 0) {
            return c;
        } else {
            map.set(c, count - 1);
        }
    }

    return "";
}