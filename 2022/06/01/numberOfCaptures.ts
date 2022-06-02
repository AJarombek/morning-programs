/**
 * https://leetcode.com/problems/available-captures-for-rook
 * @author Andrew Jarombek
 * @since 6/1/2022
 */

function numRookCaptures(board: string[][]): number {
    let i = -1;
    let j = 0;
    let found = false;

    while (!found && i < board.length) {
        i++;
        j = 0;

        while (!found && j < board.length) {
            if (board[i][j] == "R") {
                found = true;
            } else {
                j++;
            }
        }
    }

    let searchDirection = (xi: number, yi: number) => search(board, i, j, xi, yi);

    let result = searchDirection(0, 1);
    result += searchDirection(1, 0);
    result += searchDirection(-1, 0);
    result += searchDirection(0, -1);
    return result;
};

function search(board: string[][], x: number, y: number, xi: number, yi: number) {
    if (x < 0 || y < 0 || x == board.length || y == board.length)
        return 0;

    let value = board[x][y];
    if (value == "B")
        return 0;

    if (value == "p")
        return 1;

    return search(board, x + xi, y + yi, xi, yi);
}