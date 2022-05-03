/**
 * https://leetcode.com/problems/rectangle-overlap/
 * @author Andrew Jarombek
 * @since 5/2/2022
 */

function isRectangleOverlap(rec1: number[], rec2: number[]): boolean {
    if (rec1[0] == rec1[2] || rec2[0] == rec2[2] || rec1[1] == rec1[3] || rec2[1] == rec2[3])
        return false;

    let result = rec1[0] >= rec2[2] || rec1[3] <= rec2[1] || rec1[2] <= rec2[0] || rec1[1] >= rec2[3];
    return !result;
}