/**
 * https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
 * @author Andrew Jarombek
 * @since 9/29/2022
 */

function trimMean(arr: number[]): number {
    const min = Math.floor((arr.length - 1) / 20) + 1;
    const max = arr.length - min;
    let sum = 0;

    arr.sort((a, b) => a - b);

    for (let i = min; i < max; i++) {
        sum += arr[i];
    }
    return sum / (max - min);
}

// Misread the problem description, this solves a different problem
function trimMeanMisread(arr: number[]): number {
    let min = arr[0];
    let max = arr[0];

    for (let i = 1; i < arr.length; i++) {
        let val = arr[i];
        min = Math.min(min, val);
        max = Math.max(max, val);
    }

    const offset = (max - min) / 20;
    const low = min + offset;
    const high = max - offset;

    let sum = 0;
    let count = 0;

    for (let val of arr) {
        if (val > low && val < high) {
            sum += val;
            count++;
        } else {
            console.info(val);
        }
    }

    return sum / count;
}