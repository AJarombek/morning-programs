/**
 * https://leetcode.com/problems/largest-triangle-area/
 * @author Andrew Jarombek
 * @since 1/5/2023
 */

const largestTriangleArea = function(points) {
    let result = 0;

    for (let [oneX, oneY] of points) {
        for (let [twoX, twoY] of points) {
            for (let [threeX, threeY] of points) {
                let size = Math.abs((oneX * twoY + twoX * threeY + threeX * oneY - oneY * twoX - twoY * threeX - threeY * oneX) / 2);
                result = Math.max(result, size);
            }
        }
    }

    return result;
}

console.assert(largestTriangleArea([[1,0],[0,0],[0,1]]) === 0.5);
