/**
 * https://leetcode.com/problems/count-good-triplets/
 * @author Andrew Jarombek
 * @since 11/30/2021
 */

const countGoodTriplets = function(arr, a, b, c) {
    let result_set = new Set();

    for (let i = 0; i < arr.length - 2; i++) {
        for (let j = i + 1; j < arr.length - 1; j++) {
            for (let k = j + 1; k < arr.length; k++) {
                const a_valid = Math.abs(arr[i] - arr[j]) <= a;
                const b_valid = Math.abs(arr[j] - arr[k]) <= b;
                const c_valid = Math.abs(arr[i] - arr[k]) <= c;

                if (a_valid && b_valid && c_valid) {
                    result_set.add(`${i},${j},${k}`);
                }
            }
        }
    }

    return result_set.size;
};