/**
 * https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
 * @author Andrew Jarombek
 * @since 11/1/2021
 */

const trimMean = function(arr) {
    const sortedArr = arr.sort((a, b) => +a - +b);
    const offset = Math.floor(arr.length / 20);

    let sum = 0;

    for (let i = offset; i < arr.length - offset; i++) {
        sum += sortedArr[i];
    }

    const count = arr.length - (offset * 2);

    return sum / count;
};