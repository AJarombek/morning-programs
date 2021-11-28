/**
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 * @author Andrew Jarombek
 * @since 11/28/2021
 */

const canMakeArithmeticProgression = function(arr) {
    arr.sort((a, b) => +a - +b);

    let prev = arr[1];
    let diff = Math.abs(arr[0] - arr[1]);

    for (let i = 2; i < arr.length; i++) {
        if (diff !== Math.abs(prev - arr[i])) {
            return false;
        }

        prev = arr[i];
    }

    return true;
};