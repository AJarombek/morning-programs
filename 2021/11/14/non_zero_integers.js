/**
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 * @author Andrew Jarombek
 * @since 11/14/2021
 */

const getNoZeroIntegers = function(n) {
    let high = n - 1;
    let low = Math.ceil(n / 2);

    while (high >= low) {
        if (noZeros(high) && noZeros(n - high)) {
            return [high, n - high];
        }

        if (noZeros(low) && noZeros(n - low)) {
            return [low, n - low];
        }

        high -= 1;
        low += 1;
    }

    return [];
};

const noZeros = function(n) {
    while (n > 0) {
        if (n % 10 === 0) {
            return false;
        }

        n = Math.floor(n / 10);
    }

    return true;
}