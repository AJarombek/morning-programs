/**
 * https://leetcode.com/problems/fair-candy-swap/
 * @author Andrew Jarombek
 * @since 5/11/2022
 */

function fairCandySwap(aSizes: number[], bSizes: number[]): number[] {
    const aTotal = aSizes.reduce((acc, val) => acc + val);
    const bTotal = bSizes.reduce((acc, val) => acc + val);
    const diff = Math.floor((bTotal - aTotal) / 2);
    const map = new Map<number, number>();

    for (let a of aSizes) {
        map.set(a + diff, a);
    }

    for (let key of bSizes) {
        if (map.has(key)) {
            let value = map.get(key);
            return [value, key];
        }
    }

    return [];
}