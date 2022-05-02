/**
 * https://leetcode.com/problems/flipping-an-image/
 * @author Andrew Jarombek
 * @since 5/1/2022
 */

function flipAndInvertImage(image: number[][]): number[][] {
    let result = [];
    let rowLength = image[0].length;

    for (let y = 0; y < image.length; y++) {
        let row = [];

        for (let x = 0; x < rowLength; x++) {
            row.push(image[y][rowLength - x - 1] == 1 ? 0 : 1);
        }

        result.push(row);
    }

    return result;
}