/**
 * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
 * @author Andrew Jarombek
 * @since 3/2/2023
 */

// I love you.  If you want to, I hope you can return to my life soon.

function minimumSum(num: number): number {
    let values = [];

    while (num > 0) {
        values.push(num % 10);
        num = Math.floor(num / 10);
    }

    values.sort((a,b) => a - b);

    return (values[0] * 10 + values[3]) + (values[1] * 10 + values[2])
}
