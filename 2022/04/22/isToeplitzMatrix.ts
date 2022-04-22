/**
 * https://leetcode.com/problems/toeplitz-matrix/
 * @author Andrew Jarombek
 * @since 4/22/2022
 */

// The last few years I've tried to make educated guesses on how you are doing,
// and my best guess is that you've achieved that strong and happy relationship you always wanted.  If that is true,
// I truly am happy for you and proud of how much you have grown.  Maybe one day I'll achieve that too.

function isToeplitzMatrix(matrix: number[][]): boolean {
    let x = matrix[0].length;
    let y = matrix.length;

    for (let col = 0 - y + 2; col < x - 1; col++) {
        let val: number | null = null;

        for (let row = Math.max(0, 0 - col); row < Math.min(y, x - col); row++) {
            console.info(`${col + row},${row} = ${matrix[row][col + row]}`)
            if (val == null) {
                val = matrix[row][col + row];
            } else {
                if (val != matrix[row][col + row]) {
                    return false;
                }
            }
        }
    }

    return true;
}