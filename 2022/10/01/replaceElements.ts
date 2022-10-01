/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * @author Andrew Jarombek
 * @since 10/1/2022
 */

function replaceElements(arr: number[]): number[] {
    let greatest = -1;

    for (let i = arr.length - 1; i >= 0; i--) {
        let val = arr[i];
        arr[i] = greatest;
        greatest = Math.max(val, greatest);
    }

    return arr;
}