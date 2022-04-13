/**
 * https://leetcode.com/problems/flood-fill/
 * @author Andrew Jarombek
 * @since 4/13/2022
 */

// If it makes any difference, there is nothing anyone can do to you or say about you that will make me love you any
// less or dream of a future any different.  You are so brave, love.

function floodFill(image: number[][], sr: number, sc: number, newColor: number): number[][] {
    fill(image, sr, sc, newColor, image[sr][sc], new Set<string>());
    return image;
}

function fill(image: number[][], r: number, c: number, newColor: number, target: number, filled: Set<string>) {
    let str = `${r},${c}`;
    let val = image[r][c];

    if (val == target && !filled.has(str)) {
        filled.add(str);
        image[r][c] = newColor;

        if (r > 0) {
            fill(image, r - 1, c, newColor, target, filled);
        }

        if (c > 0) {
            fill(image, r, c - 1, newColor, target, filled);
        }

        if (r < image.length - 1) {
            fill(image, r + 1, c, newColor, target, filled);
        }

        if (c < image[0].length - 1) {
            fill(image, r, c + 1, newColor, target, filled);
        }
    }
}