/**
 * https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
 * @author Andrew Jarombek
 * @since 6/4/2022
 */

function canThreePartsEqualSum(arr: number[]): boolean {
    let rest = arr.reduce((acc, val) => acc + val);
    let first = 0;
    let index = 0;

    while (index < arr.length - 2) {
        rest -= arr[index];
        first += arr[index];
        index++;

        let third = rest;
        let second = 0;

        for (let i = index; i < arr.length - 1; i++) {
            second += arr[i];
            third -= arr[i];

            if (first == second && second == third) {
                return true;
            }
        }
    }

    return false;
}