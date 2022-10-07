/**
 * https://leetcode.com/problems/three-consecutive-odds/
 * @author Andrew Jarombek
 * @since 10/7/2022
 */

function threeConsecutiveOdds(arr: number[]): boolean {
    let count = 0;

    for (let i of arr) {
        if (i % 2 == 1) {
            count++;

            if (count == 3) {
                return true;
            }
        } else {
            count = 0;
        }
    }

    return false;
}