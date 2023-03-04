/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/
 * @author Andrew Jarombek
 * @since 3/4/2023
 */

function countEven(num: number): number {
    let result = 0;

    for (let i = 1; i <= num; i++) {
        let val = 0;
        let n = i;

        while (n > 0) {
            val += n % 10;
            n = Math.floor(n / 10);
        }

        if (val % 2 == 0) {
            result++;
        }
    }

    return result;
}