/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * @author Andrew Jarombek
 * @since 10/9/2022
 */

function uniqueOccurrences(arr: number[]): boolean {
    let map = new Map<number, number>();

    for (let val of arr) {
        map.set(val, (map.get(val) ?? 0) + 1);
    }

    let set = new Set<number>();

    for (let val of map.values()) {
        set.add(val);
    }

    return map.size == set.size;
}