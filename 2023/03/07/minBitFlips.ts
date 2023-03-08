/**
 * https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
 * @author Andrew Jarombek
 * @since 3/7/2023
 */

function minBitFlips(start: number, goal: number): number {
    let num = start ^ goal;
    let result = 0;

    while (num > 0) {
        result += num % 2;
        num >>= 1;
    }

    return result;
}

function minBitFlipsV1(start: number, goal: number): number {
    let startBits = [];
    let goalBits = [];

    while (start > 0) {
        startBits.push(start % 2);
        start >>= 1;
    }

    while (goal > 0) {
        goalBits.push(goal % 2);
        goal >>= 1;
    }

    let result = 0;

    for (let i = 0; i < Math.max(startBits.length, goalBits.length); i++) {
        const a = (i < startBits.length) ? startBits[i] : 0;
        const b = (i < goalBits.length) ? goalBits[i] : 0;

        if (a != b) {
            result++;
        }
    }

    return result;
}