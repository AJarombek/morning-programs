/**
 * https://leetcode.com/problems/smallest-even-multiple/
 * @author Andrew Jarombek
 * @since 3/22/2023
 */

function smallestEvenMultiple(n: number): number {
    return (n % 2 == 0) ? n : n*2;
}