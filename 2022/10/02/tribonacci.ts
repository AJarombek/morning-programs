/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 * @author Andrew Jarombek
 * @since 10/2/2022
 */

function tribonacci(n: number): number {
    if (n == 0)
        return n;

    if (n <= 2)
        return 1;

    const seq = [0, 1, 1];
    let i = 3;

    while (i <= n) {
        let val = seq[0] + seq[1] + seq[2];
        seq[0] = seq[1];
        seq[1] = seq[2];
        seq[2] = val;

        i++;
    }

    return seq[2];
}