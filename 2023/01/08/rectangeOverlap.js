/**
 * https://leetcode.com/problems/rectangle-overlap/
 * @author Andrew Jarombek
 * @since 1/8/2023
 */

const isRectangleOverlap = function(rec1, rec2) {
    return !(
        rec1[0] >= rec2[2] ||
        rec1[1] >= rec2[3] ||
        rec1[2] <= rec2[0] ||
        rec1[3] <= rec2[1]
    );
};

console.assert(isRectangleOverlap([0,0,2,2], [1,1,3,3]));
console.assert(!isRectangleOverlap([0,0,1,1], [1,0,2,1]));
console.assert(!isRectangleOverlap([0,0,1,1], [2,2,3,3]));
