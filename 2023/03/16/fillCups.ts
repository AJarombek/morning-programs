/**
 * https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/
 * @author Andrew Jarombek
 * @since 3/16/2023
 */

function fillCups(amount: number[]): number {
    let result = amount[0];
    let val = result;
    let diff = Math.abs(amount[1] - amount[2]);
    const change = Math.min(val, diff);

    if (amount[1] > amount[2]) {
        amount[1] -= change;
    } else {
        amount[2] -= change;
    }

    val -= change;

    if (val % 2 == 1) {
        if (amount[1] > amount[2]) {
            amount[1]--;
        } else {
            amount[2]--;
        }
    }

    amount[1] -= Math.floor(val / 2);
    amount[2] -= Math.floor(val / 2);

    if (amount[1] > 0) {
        result += amount[1];
        amount[2] -= amount[1];
    }

    return result + Math.max(0, amount[2]);
}