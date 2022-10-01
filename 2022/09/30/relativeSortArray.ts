/**
 * https://leetcode.com/problems/relative-sort-array/
 * @author Andrew Jarombek
 * @since 9/30/2022
 */

function relativeSortArray(arr1: number[], arr2: number[]): number[] {
    let map = new Map<number, number>();

    for (let i = 0; i < arr2.length; i++) {
        let val = arr2[i];
        map.set(val, i);
    }

    arr1.sort((a, b) => {
        let val = (map.get(a) ?? arr1.length) - (map.get(b) ?? arr1.length);
        if (val == 0)
            val = a - b;

        return val;
    });
    return arr1;
}