/**
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 * @author Andrew Jarombek
 * @since 11/12/2021
 */

const tictactoe = function(moves) {
    const board = [['', '', ''], ['', '', ''], ['', '', '']]

    for (let i = 0; i < moves.length; i++) {
        const move = moves[i];
        board[move[0]][move[1]] = i % 2 === 0 ? 'A' : 'B';

        for (let j = 0; j < board.length; j++) {
            if (board[j][0] && board[j][0] === board[j][1] && board[j][1] === board[j][2]) {
                return board[j][0];
            }

            if (board[0][j] && board[0][j] === board[1][j] && board[1][j] === board[2][j]) {
                return board[0][j];
            }
        }

        if (board[0][0] && board[0][0] === board[1][1] && board[1][1] === board[2][2]) {
            return board[0][0];
        }

        if (board[0][2] && board[0][2] === board[1][1] && board[1][1] === board[2][0]) {
            return board[0][2];
        }
    }

    for (const row of board) {
        for (const cell of row) {
            if (cell === '') {
                return 'Pending';
            }
        }
    }

    return 'Draw';
};