/**
 * https://leetcode.com/problems/image-smoother/
 * @author Andrew Jarombek
 * @since 4/7/2022
 */

function imageSmoother(img: number[][]): number[][] {
    let result = [];

    for (let y = 0; y < img.length; y++) {
        let row = [];

        for (let x = 0; x < img[0].length; x++) {
            let count = 1;
            let sum = img[y][x];

            if (y > 0 && x > 0) {
                sum += img[y-1][x-1];
                count++;
            }

            if (y > 0) {
                sum += img[y-1][x];
                count++;
            }

            if (y > 0 && x < img[0].length - 1) {
                sum += img[y-1][x+1];
                count++;
            }

            if (x < img[0].length - 1) {
                sum += img[y][x+1];
                count++;
            }

            if (y < img.length - 1 && x < img[0].length - 1) {
                sum += img[y+1][x+1];
                count++;
            }

            if (y < img.length - 1) {
                sum += img[y+1][x];
                count++;
            }

            if (y < img.length - 1 && x > 0) {
                sum += img[y+1][x-1];
                count++;
            }

            if (x > 0) {
                sum += img[y][x-1];
                count++;
            }

            row.push(Math.floor(sum / count));
        }

        result.push(row);
    }

    return result;
}