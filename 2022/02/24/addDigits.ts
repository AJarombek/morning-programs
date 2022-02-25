/**
 * https://leetcode.com/problems/add-digits/
 * @author Andrew Jarombek
 * @since 2/24/2022
 */

function addDigits(num: number): number {
    while (num > 9) {
        let n = 0;
        let m = num;

        while (m > 0) {
            n += m % 10;
            m = Math.floor(m / 10);
        }

        num = n;
    }

    return num;
}