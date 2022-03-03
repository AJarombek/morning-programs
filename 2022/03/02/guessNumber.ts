/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * @author Andrew Jarombek
 * @since 3/2/2022
 */

const num = 6;

function guessFactory(num: number): (n: number) => number {
    return (n: number): number => {
        if (n == num) {
            return 0;
        } else if (n < num) {
            return -1;
        } else {
            return 1;
        }
    }
}

const guess = guessFactory(num);

function guessNumber(n: number): number {
    let low = 1;
    let high = n;

    while (low <= high) {
        const mid = Math.floor((low + high) / 2);
        const result = guess(mid);

        if (result == 0) {
            return mid;
        } else if (result == 1) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return high;
}