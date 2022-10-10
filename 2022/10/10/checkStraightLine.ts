/**
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 * @author Andrew Jarombek
 * @since 10/10/2022
 */

function checkStraightLine(coordinates: number[][]): boolean {
    let i = 2;

    while (i < coordinates.length) {
        const x = (coordinates[i-1][1] - coordinates[i-2][1]) * (coordinates[i][0] - coordinates[i-1][0]);
        const y = (coordinates[i-1][0] - coordinates[i-2][0]) * (coordinates[i][1] - coordinates[i-1][1]);

        if (x != y) {
            return false;
        }

        i++;
    }

    return true;
}