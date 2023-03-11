/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/
 * @author Andrew Jarombek
 * @since 3/10/2023
 */

function convertTime(current: string, correct: string): number {
    let start = (+current.substring(0, 2) * 60) + +current.substring(3);
    let end = (+correct.substring(0, 2) * 60) + +correct.substring(3);
    let result = 0;

    while (start <= end - 60) {
        result++;
        start += 60;
    }

    while (start <= end - 15) {
        result++;
        start += 15;
    }

    while (start <= end - 5) {
        result++;
        start += 5;
    }

    while (start <= end - 1) {
        result++;
        start++;
    }

    return result;
}