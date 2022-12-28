/**
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 * @author Andrew Jarombek
 * @since 12/28/2022
 */

const countPrimeSetBits = function(left, right) {
    let result = 0;

    for (let i = left; i <= right; i++) {
        let num = i;
        let count = 0;

        while (num > 0) {
            if (num & 1) {
                count++;
            }

            num >>= 1;
        }

        if (isPrime(count)) {
            result++;
        }
    }

    return result;
};

function isPrime(num) {
    if (num <= 3) {
        return num > 1;
    }

    if (num % 2 === 0 || num % 3 === 0) {
        return false;
    }

    for (let i = 5; i * i <= num; i++) {
        if (num % i === 0)
            return false;
    }

    return true;
}

console.assert(countPrimeSetBits(6, 10) === 4);
console.assert(countPrimeSetBits(10, 15) === 5);
