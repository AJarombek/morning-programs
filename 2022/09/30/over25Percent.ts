/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 * @author Andrew Jarombek
 * @since 9/30/2022
 */

function findSpecialInteger(arr: number[]): number {
    let threshold = arr.length / 4;
    let count = 0;
    let prev: number | null = null;

    for (let i of arr) {
        if (i == prev) {
            count++;

            if (count > threshold)
                return i;
        } else {
            prev = i;
            count = 1;
        }
    }

    return prev;
}