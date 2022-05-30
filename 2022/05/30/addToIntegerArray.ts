/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 * @author Andrew Jarombek
 * @since 5/30/2022
 */

function addToArrayForm(num: number[], k: number): number[] {
    let result = [];
    let remainder = 0;
    let i = num.length - 1

    while (i >= 0 || k > 0) {
        let val = (i >= 0 ? num[i] : 0) + (k % 10) + remainder;
        result.push(val % 10);
        remainder = Math.floor(val / 10);

        k = Math.floor(k / 10);
        i--;
    }

    if (remainder) {
        result.push(remainder);
    }

    let finalResult = [];
    for (let i = result.length - 1; i >= 0; i--) {
        finalResult.push(result[i]);
    }

    return finalResult;
}