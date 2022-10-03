/**
 * https://leetcode.com/problems/rank-transform-of-an-array/
 * @author Andrew Jarombek
 * @since 10/3/2022
 */

function arrayRankTransform(arr: number[]): number[] {
    const sortedArr = [...arr];
    sortedArr.sort((a, b) => a - b);

    const map = new Map<number, number>();
    let rank = 1;
    let prev = sortedArr[0] - 1;

    for (let i = 0; i < sortedArr.length; i++) {
        const val = sortedArr[i];

        if (val != prev) {
            map.set(val, rank);
            rank++;
            prev = val;
        }
    }

    return arr.map((val) => map.get(val));
}