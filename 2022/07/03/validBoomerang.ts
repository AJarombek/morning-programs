/**
 * https://leetcode.com/problems/valid-boomerang/
 * @author Andrew Jarombek
 * @since 7/3/2022
 */

function isBoomerang(points: number[][]): boolean {
    if (points[0][0] == points[1][0] && points[0][1] == points[1][1])
        return false;

    if (points[1][0] == points[2][0] && points[1][1] == points[2][1])
        return false;

    if (points[0][0] == points[2][0] && points[0][1] == points[2][1])
        return false;

    const z1 = (points[0][1] - points[1][1]) * (points[1][0] - points[2][0]);
    const z2 = (points[1][1] - points[2][1]) * (points[0][0] - points[1][0]);

    return z1 != z2;
}