/**
 * https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 * @author Andrew Jarombek
 * @since 10/10/2022
 */

function minCostToMoveChips(position: number[]): number {
    let odds = 0;
    let evens = 0;

    for (let val of position) {
        if (val % 2 == 0) {
            evens++;
        } else {
            odds++;
        }
    }

    return Math.min(odds, evens);
}