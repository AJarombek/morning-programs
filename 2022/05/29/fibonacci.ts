/**
 * https://leetcode.com/problems/fibonacci-number/
 * @author Andrew Jarombek
 * @since 5/29/2022
 */

function fib(n: number): number {
    if (n <= 1) {
        return n;
    }

    let x = 1;
    let y = 1;

    for (let i = 2; i < n; i++) {
        let z = x + y;
        x = y;
        y = z;
    }

    return y;
}