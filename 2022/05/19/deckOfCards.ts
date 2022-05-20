/**
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 * @author Andrew Jarombek
 * @since 5/19/2022
 */

function hasGroupsSizeX(deck: number[]): boolean {
    const map = new Map<number, number>();
    let gcd = 0;

    for (let num of deck) {
        const val = (map.get(num) ?? 0) + 1;
        map.set(num, val);
        gcd = Math.max(gcd, val);
    }

    for (let val of map.values()) {
        gcd = greatestCommonDivisor(Math.min(gcd, val), Math.max(gcd, val));
    }

    return gcd >= 2;
}

function greatestCommonDivisor(x: number, y: number) {
    return x == 0 ? y : greatestCommonDivisor(y % x, x);
}