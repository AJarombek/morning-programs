/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * @author Andrew Jarombek
 * @since 12/30/2022
 */

const isToeplitzMatrix = function(matrix) {
    for (let i = 1; i < matrix.length; i++) {
        for (let j = 1; j < matrix[0].length; j++) {
            if (matrix[i][j] !== matrix[i-1][j-1]) {
                return false;
            }
        }
    }

    return true;
}

console.assert(isToeplitzMatrix([[1,2,3,4], [5,1,2,3], [9,5,1,2]]));
console.assert(!isToeplitzMatrix([[1,2],[2,2]]));
