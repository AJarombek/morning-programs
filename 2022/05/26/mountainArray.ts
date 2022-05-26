/**
 * https://leetcode.com/problems/valid-mountain-array/
 * @author Andrew Jarombek
 * @since 5/26/2022
 */

function validMountainArray(arr: number[]): boolean {
    if (arr.length < 3) {
        return false;
    }

    let upwards = true;
    let up = 0;

    for (let i = 1; i < arr.length; i++) {
        if (upwards) {
            if (arr[i] < arr[i - 1]) {
                if (!up)
                    return false;

                upwards = false;
            } else if (arr[i] == arr[i - 1]) {
                return false;
            } else {
                up++
            }
        } else {
            if (arr[i] >= arr[i - 1])
                return false;
        }
    }

    return !upwards;
}