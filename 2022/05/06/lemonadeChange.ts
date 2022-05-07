/**
 * https://leetcode.com/problems/lemonade-change/
 * @author Andrew Jarombek
 * @since 5/6/2022
 */

interface Change {
    5: number;
    10: number;
    20: number;
}

function lemonadeChange(bills: number[]): boolean {
    let change: Change = {
        5: 0,
        10: 0,
        20: 0
    }

    for (let bill of bills) {
        change[bill] = change[bill] + 1;
        bill -= 5;

        while (bill >= 20 && change[20] > 0) {
            bill -= 20;
            change[20] = change[20] - 1;
        }

        while (bill >= 10 && change[10] > 0) {
            bill -= 10;
            change[10] = change[10] - 1;
        }

        while (bill >= 5 && change[5] > 0) {
            bill -= 5;
            change[5] = change[5] - 1;
        }

        if (bill > 0) {
            return false;
        }
    }

    return true;
}