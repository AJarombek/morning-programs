/**
 * https://leetcode.com/problems/valid-mountain-array/
 * @author Andrew Jarombek
 * @since 1/29/2024
 */

const validMountainArray = function(arr) {
    if (arr.length < 3 || arr[0] > arr[1]) {
        return false;
    }

    let increasing = true;
    let previous = arr[0];

    for (const val of arr.slice(1)) {
        if (val === previous)
            return false;

        if (increasing) {
            if (val < previous)
                increasing = false;
        } else {
            if (val > previous)
                return false;
        }

        previous = val;
    }

    return !increasing;
};
