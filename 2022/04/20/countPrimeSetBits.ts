/**
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 * @author Andrew Jarombek
 * @since 4/20/2022
 */

function countPrimeSetBits(left: number, right: number): number {
    let result = 0;

    for (let i = left; i <= right; i++) {
        let bits = 0;
        let num = i;

        while (num > 0) {
            bits += num % 2;
            num = Math.floor(num / 2);
        }

        if (isPrime(bits)) {
            result++;
        }
    }

    return result;
}

function isPrime(num: number): boolean {
    if (num <= 3) {
        return num > 1;
    }

    if (num % 2 == 0 || num % 3 == 0) {
        return false;
    }

    for (let i = 5; i * i <= num; i++) {
        if (num % i == 0)
            return false;
    }

    return true;
}