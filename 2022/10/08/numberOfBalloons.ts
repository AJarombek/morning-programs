/**
 * https://leetcode.com/problems/maximum-number-of-balloons/
 * @author Andrew Jarombek
 * @since 10/8/2022
 */

function maxNumberOfBalloons(text: string): number {
    let map = new Map<string, number>();

    for (let c of text) {
        const val = map.get(c) ?? 0;
        map.set(c, val + 1);
    }

    for (let c of ['l', 'o']) {
        const val = map.get(c) ?? 0;
        map.set(c, Math.floor(val / 2));
    }

    let result = Infinity;

    for (let c of ['b', 'a', 'l', 'o', 'n']) {
        result = Math.min(result, map.get(c) ?? 0);
    }

    return result;
}