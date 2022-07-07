/**
 * https://leetcode.com/problems/height-checker/
 * @author Andrew Jarombek
 * @since 7/6/2022
 */

function heightChecker(heights: number[]): number {
    let orderedHeights = [...heights];
    orderedHeights.sort((x, y) => x - y);

    let result = 0;

    for (let i = 0; i < heights.length; i++) {
        result += heights[i] != orderedHeights[i] ? 1 : 0;
    }

    return result;
}