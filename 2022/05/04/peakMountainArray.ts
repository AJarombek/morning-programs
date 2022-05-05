/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * @author Andrew Jarombek
 * @since 5/4/2022
 */

function peakIndexInMountainArray(arr: number[]): number {
    let start = 0;
    let end = arr.length - 1;

    while (start <= end) {
        let mid = Math.floor((start + end) / 2);

        if (mid == 0) {
            if (arr[0] > arr[1]) {
                return 0;
            } else {
                return 1;
            }
        } else if (mid == arr.length - 1) {
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                return arr.length - 1;
            } else {
                return arr.length - 2;
            }
        } else {
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return start;
}