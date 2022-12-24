/**
 * https://leetcode.com/problems/flood-fill/
 * @author Andrew Jarombek
 * @since 12/24/2022
 */

const floodFill = function(image, sr, sc, color) {
    if (image[sr][sc] === color) {
        return image;
    }

    fill(image, sr, sc, image[sr][sc], color);
    return image;
};

const fill = function(image, sr, sc, from, to) {
    image[sr][sc] = to;

    if (sr > 0 && image[sr-1][sc] === from) {
        fill(image, sr-1, sc, from, to);
    }

    if (sc > 0 && image[sr][sc-1] === from) {
        fill(image, sr, sc-1, from, to);
    }

    if (sr < image.length - 1 && image[sr+1][sc] === from) {
        fill(image, sr+1, sc, from, to);
    }

    if (sc < image[0].length - 1 && image[sr][sc+1] === from) {
        fill(image, sr, sc+1, from, to);
    }
}

let matrix = [[1,1,1], [1,1,0], [1,0,1]];
let expected = [[2,2,2], [2,2,0], [2,0,1]];
let result = floodFill(matrix, 1, 1, 2);

console.assert(
    expected.every((row, r) => row.every(
        (value, c) => value === result[r][c]
    ))
);
