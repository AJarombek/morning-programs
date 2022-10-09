/**
 * https://leetcode.com/problems/minimum-absolute-difference/
 * @author Andrew Jarombek
 * @since 10/9/2022
 */

function minimumAbsDifference(arr: number[]): number[][] {
    arr.sort((a, b) => a - b);

    let min = Infinity;
    let result = [];
    let prev = arr[0];

    for (let val of arr.slice(1)) {
        const diff = val - prev;

        if (diff < min) {
            result = [[prev, val]];
            min = diff;
        } else if (diff == min) {
            result.push([prev, val]);
        }

        prev = val;
    }

    return result;
}