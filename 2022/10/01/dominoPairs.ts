/**
 * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
 * @author Andrew Jarombek
 * @since 10/1/2022
 */

function numEquivDominoPairs(dominoes: number[][]): number {
    let map = new Map<string, number>();
    let result = 0;

    for (let domino of dominoes) {
        let [x, y] = domino;
        let id = `${Math.min(x, y)},${Math.max(x, y)}`;
        let val = map.get(id) ?? 0;
        result += val;
        map.set(id, val + 1);
    }

    return result;
}