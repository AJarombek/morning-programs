/**
 * https://leetcode.com/problems/image-smoother/
 * @author Andrew Jarombek
 * @since 12/19/2022
 */

const imageSmoother = function(img) {
    let result = [];

    for (let y = 0; y < img.length; y++) {
        let row = [];

        for (let x = 0; x < img[0].length; x++) {
            let sum = img[y][x];
            let count = 1;

            const up = y > 0;
            const down = y < img.length - 1;
            const left = x > 0;
            const right = x < img[0].length - 1;

            if (up) {
                sum += img[y-1][x];
                count++;

                if (left) {
                    sum += img[y-1][x-1];
                    count++;
                }

                if (right) {
                    sum += img[y-1][x+1];
                    count++;
                }
            }

            if (down) {
                sum += img[y+1][x];
                count++;

                if (left) {
                    sum += img[y+1][x-1];
                    count++;
                }

                if (right) {
                    sum += img[y+1][x+1];
                    count++;
                }
            }

            if (left) {
                sum += img[y][x-1];
                count++;
            }

            if (right) {
                sum += img[y][x+1];
                count++;
            }

            row.push(Math.floor(sum / count));
        }

        result.push(row);
    }

    return result;
};

let matrix = [[1,1,1], [1,0,1], [1,1,1]];
let expected = [[0,0,0], [0,0,0], [0,0,0]];
let result = imageSmoother(matrix);

console.assert(
    expected.every((row, r) => row.every(
        (value, c) => value === result[r][c]
    ))
);

matrix = [[100,200,100], [200,50,200], [100,200,100]];
expected = [[137,141,137], [141,138,141], [137,141,137]];
result = imageSmoother(matrix);

console.assert(
    expected.every((row, r) => row.every(
        (value, c) => value === result[r][c]
    ))
);
