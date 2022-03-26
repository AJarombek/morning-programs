/**
 * https://leetcode.com/problems/base-7/
 * @author Andrew Jarombek
 * @since 3/25/2022
 */

function convertToBase7(num: number): string {
    let neg = num < 0;
    num = Math.abs(num);

    let val = 0;
    let index = 0;

    while (num > 0) {
        val += (num % 7) * (10 ** index);
        num = Math.floor(num / 7);
        index++;
    }

    return `${neg ? '-' : ''}${val}`;
}
