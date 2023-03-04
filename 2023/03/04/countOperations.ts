/**
 * https://leetcode.com/problems/count-operations-to-obtain-zero/
 * @author Andrew Jarombek
 * @since 3/4/2023
 */

function countOperations(num1: number, num2: number): number {
    let first = Math.max(num1, num2);
    let second = Math.min(num1, num2);
    let count = 0;

    while (second != 0) {
        num1 = second;
        num2 = first - second;

        first = Math.max(num1, num2);
        second = Math.min(num1, num2);
        count++;
    }

    return count;
}