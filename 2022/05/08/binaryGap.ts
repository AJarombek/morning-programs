/**
 * https://leetcode.com/problems/binary-gap/
 * @author Andrew Jarombek
 * @since 5/8/2022
 */

function binaryGap(n: number): number {
    let max = 0;
    let count = -1;

    while (n > 0) {
        if (n % 2 == 0) {
            if (count >= 0) {
                count++;
            }
        } else {
            max = Math.max(max, count + 1);
            count = 0
        }

        n = Math.floor(n / 2);
    }

    return max;
}