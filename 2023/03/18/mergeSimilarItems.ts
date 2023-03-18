/**
 * https://leetcode.com/problems/merge-similar-items/
 * @author Andrew Jarombek
 * @since 3/18/2023
 */

function mergeSimilarItems(items1: number[][], items2: number[][]): number[][] {
    const map = new Map<number, number>();

    for (let item of items1) {
        map.set(item[0], item[1]);
    }

    for (let item of items2) {
        map.set(item[0], (map.get(item[0]) ?? 0) + item[1]);
    }

    const result = [];

    map.forEach((value, key) => {
        result.push([key, value]);
    });

    result.sort((a, b) => a[0] - b[0]);
    return result;
}