/**
 * https://leetcode.com/problems/duplicate-zeros/
 * @author Andrew Jarombek
 * @since 9/28/2022
 */

function duplicateZeros(arr: number[]): void {
    let offset = 0;
    let end = arr.length - 1;
    let index = 0;

    let i = arr.length - 1;

    while (index <= end) {
        if (arr[index] == 0) {
            if (index == end) {
                arr[arr.length - 1] = 0;
                i--;
            } else {
                end--;
                offset++;
            }
        }

        index++;
    }

    while (i >= 0 && offset >= 0) {
        let val = arr[i - offset];

        arr[i] = val;

        if (val == 0) {
            i--;
            offset--;
            arr[i] = val;
        }

        i--;
    }
}